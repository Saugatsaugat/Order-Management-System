package com.saugat.ordermanagementsystem.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private static final Logger log = LogManager.getLogger(LoginController.class);

    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    public String displayLoginPage(@RequestParam(value = "error", required = false) String error,
                                   @RequestParam(value = "logout", required = false) String logout,
                                   Model model){

        String errorMessage = null;
        if(null != error){
            errorMessage = "Username or password is incorrect !!!";
        }

        if(null != logout){
            errorMessage = "You have been successfully logged out !!!";
            log.info(errorMessage);
        }

        model.addAttribute("errorMessage", errorMessage); // is only useful when the frontend is rendered on the server (e.g., Thymeleaf, JSP, Freemarker)
        return null; // null for test purpose only.
    }

//    @RequestMapping(value = "/invalidSession", method = {RequestMethod.GET})
//    public String invalidSession(){
//        return "";
//    }

}
