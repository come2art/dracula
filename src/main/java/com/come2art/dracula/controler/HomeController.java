package com.come2art.dracula.controler;

import org.springframework.boot.SpringBootVersion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "to use Springboot by version is: " + SpringBootVersion.getVersion();
    }
}
