package com.come2art.dracula.controler;

import org.springframework.boot.SpringBootVersion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
//        return "to use Springboot by version is: " + SpringBootVersion.getVersion();
        String v = SpringBootVersion.getVersion();
        return "home";
    }
}
