package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @RequestMapping(value="/action", method= RequestMethod.POST)
//    public ModelAndView onClickAction() throws IOException {
//        Process process = Runtime.getRuntime().exec(
//                new String[]{"cmd","/c","jmeter -n -t EverydayLoadTesting.jmx -l testresults.jtl"},
//                null,
//                new File("D:\\Personal\\apache-jmeter-5.4.1\\bin")
//        );
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//        String line = "";
//        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
//        }
//        return onClickAction();
//    }

    @GetMapping(value="/run")
    public void run() //I want to link the button click to this method
    {
        System.out.println("Test1");
        System.out.println("Test2");
        System.out.println("Test3");
        System.out.println("Test4");
    }

}
