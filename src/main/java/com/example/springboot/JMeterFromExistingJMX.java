package com.example.springboot;

import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

import java.io.File;
import java.io.FileInputStream;

public class JMeterFromExistingJMX {

    public static void main(String[] argv) throws Exception {
        // JMeter Engine
        StandardJMeterEngine jmeter = new StandardJMeterEngine();

        // Initialize Properties, logging, locale, etc.
        JMeterUtils.loadJMeterProperties("D:\\Personal\\apache-jmeter-5.4.1\\bin\\jmeter.properties");
        JMeterUtils.setJMeterHome("D:\\Personal\\apache-jmeter-5.4.1");
        JMeterUtils.initLogging();// you can comment this line out to see extra log messages of i.e. DEBUG level
        JMeterUtils.initLocale();

        // Initialize JMeter SaveService
        SaveService.loadProperties();

        // Load existing .jmx Test Plan
        File in = new File("D:\\Personal\\apache-jmeter-5.4.1\\extras\\Ejercicio 01.jmx");
        HashTree testPlanTree = SaveService.loadTree(in);

        // Run JMeter Test
        jmeter.configure(testPlanTree);
        jmeter.run();
    }

}
