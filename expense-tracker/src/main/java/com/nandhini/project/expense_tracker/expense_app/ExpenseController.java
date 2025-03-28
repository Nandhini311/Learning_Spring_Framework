package com.nandhini.project.expense_tracker.expense_app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller //to inform spring that any request sent to the application will be handled by this class.
public class ExpenseController {

//    @Autowired //spring identifies this as a dependency and injects it automatically when running this class.
    private final ExpenseRepository expenseRepository;


    public ExpenseController(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @RequestMapping("/")
    //with the help of spring security, login page will automatically come.
    //by default after logging in, it will be re-directed to '/' hence we are returning our welcome page to show after login
    public String welcomePage(ModelMap model){
        String username = getLoggedInUserName();
        model.put("name", username);
        return "Welcome";
    }

    //to show the list of expenses made by the user
    @GetMapping( "/list-expenses")
    //ModelMap allows you to pass data to the view
    public String listExpense(ModelMap map){
        //we are getting the user detail
        String username = getLoggedInUserName();
        
        //finding the list of expenses of this particular user
        List<ExpenseTracker> expense = expenseRepository.findByUsername(username);

        //returning the list to list-expense page
        map.addAttribute("list", expense);
        map.addAttribute("name", username);
        return "List-Expenses";
    }

    //this method handles the request to add-expense when no data is submitted.
    @RequestMapping(value = "/add-expense", method = RequestMethod.GET)
    public String ShowAddExpense(ModelMap model){
        //initially no data, hence an object of default values are passed
        //why do we have to do this? otherwise spring will not know to which object the fields of add-expense page must be bind to
        model.addAttribute("expense", new ExpenseTracker());
        //addAttrinbute helps us to bind form data to an object.
        return "Add-Expense";
    }

    //this method handles the request to add-expense when data is submitted
    @RequestMapping(value = "/add-expense", method = RequestMethod.POST)
    public String AddExpenseValue(@ModelAttribute ExpenseTracker expense){
        String username = getLoggedInUserName();
        expense.setName(username);
        expenseRepository.save(expense); //saving the value to our repository
        return "redirect:/list-expenses";
    }

    @RequestMapping(value = "/delete-expense")
    public String DeleteExpense(ModelMap model, @RequestParam int id){
        expenseRepository.deleteById(id);
        return "redirect:/list-expenses";
    }

    @RequestMapping(value="/update-expense", method = RequestMethod.GET)
    public String UpdateExpense(ModelMap model, @RequestParam int id){
        ExpenseTracker value = expenseRepository.findById(id).get();
        model.addAttribute("expense", value);
        //expenseRepository.deleteById(id);
        return "Add-Expense";
    }

    @RequestMapping(value = "/update-expense", method = RequestMethod.POST)
    public String SaveUpdatedValue(ModelMap model, @ModelAttribute  ExpenseTracker expense){
        expense.setName(getLoggedInUserName());
        expenseRepository.save(expense);
        return "redirect:/list-expenses";
    }


    public String getLoggedInUserName(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName(); //to get the username.
    }

}
