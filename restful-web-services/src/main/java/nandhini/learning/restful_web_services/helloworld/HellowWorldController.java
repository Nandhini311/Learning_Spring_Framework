package nandhini.learning.restful_web_services.helloworld;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
//@Response body + @controller
//@Response body - To tell spring to be return value of a method should be the http response body,
//instead of looking for a view to be displayed
//returns value typically as a JSON or XML

public class HellowWorldController {

    private MessageSource messageSource; //MessageSource is a spring component that fetches localised messages from properties files.
    //works like a dictionary where you provide a key and it returns the translated value based on the locale.

    //Constructor injection
    public HellowWorldController(MessageSource messageSource){
        this.messageSource = messageSource;
    }

    @GetMapping(path="/hello-world-internationalized")
    public String helloWorldInternationalized(Locale locale){
        Locale value = LocaleContextHolder.getLocale();
        //spring boot utitily that retrieves the current locale (language preference) from the requerst automatically.
        return messageSource.getMessage("good.morning.message", null, "Default Message", value);
        //getMessage used to fetch the localised messages
        //code - key in the messages.properties
        //args - optional placeholders for dynamic values.
        //default message - fallback message if the key is not found.
        //locale - user's language preference
        //return "Hello World v2";
        //internationalizing the request
        //first define the message
    }

    //@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    //GET Method -> to retrieve data or fetch data without making any changes.
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    //return data as json
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }
    //how is this object automatically converted into a json response?
    //all our requests first go to Front controller pattern - dispatcher servlet - it is mapped to the root url
    //routes them to the correct handlers
    //configured by AutoConfiguration

    //Path Parameters - building a url which accepts path variable
    @GetMapping(path = "/hello-world/path-variable/{name}")
    //defines a GET API that is accessilble via URL
    // {name} is path variable - aka dynamically changes.
    public HelloWorldBean helloPathVaraible(@PathVariable String name){
        //name is a path parameter here which is used to extract the value from the request URL
        return new HelloWorldBean("Hello World " + name);
    }

}
