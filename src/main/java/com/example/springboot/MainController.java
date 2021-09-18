package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value="/run")
    public void run() //I want to link the button click to this method
    {
        System.out.println("Test1");
        System.out.println("Test2");
        System.out.println("Test3");
        System.out.println("Test4");
    }
}
