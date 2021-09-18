package com.example.springboot;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class JmeterFromCommands {

    public static void main(String[] args) throws Exception {

        //Ejecutando un proceso por cmd
        //Process process = Runtime.getRuntime().exec("ping www.stackabuse.com");

        //Ejecutando un proceso por carpetas
        /*Process process = Runtime.getRuntime().exec(
                new String[]{"cmd","/c","dir"},
                null,
                new File("D:\\Personal\\")
        );*/

        Process process = Runtime.getRuntime().exec("D:\\Personal\\apache-jmeter-5.4.1\\bin\\jmeter.bat -n -t EverydayLoadTesting.jmx -l testresults.jtl");

        Long processId = JmeterNewProcess.getProcessID(process);

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
              System.out.println(line);
        }
//        Thread.sleep(20000);

    }


}
