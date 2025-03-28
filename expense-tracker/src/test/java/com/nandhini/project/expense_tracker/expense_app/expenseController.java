package com.nandhini.project.expense_tracker.expense_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class expenseController {

    @RequestMapping("/login")
    public String goToLogin(){
        return "Welcome";
    }
}
