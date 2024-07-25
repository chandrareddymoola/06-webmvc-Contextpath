package com.chnadra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    //so add context path in application.properties
    //without add then normal link acess
//http://localhost:8080/chandra/welcome   link for that  acessing the context path
    @GetMapping("/welcome")
    public String getWelcomeMessage(Model model){
        model.addAttribute("hello","In Model always data to be key value pair");
        return "index";
    }
 //   http://localhost:8080/chandra/greet
    @GetMapping("/greet")
    @ResponseBody  // it is used to send data directly to the client
    public String getGreetMessage(){
// without cretae model we can execute by adding response body to the method
        //no need to create index.html otherwise it throws error
        return "Good Morning Client !!!!";
    }
}
