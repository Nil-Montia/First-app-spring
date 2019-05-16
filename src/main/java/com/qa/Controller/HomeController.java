package com.qa.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello. Please specify the information request further with " +
                "/task/, /user/, or /block/, and the appropiate method.";
    }
}
