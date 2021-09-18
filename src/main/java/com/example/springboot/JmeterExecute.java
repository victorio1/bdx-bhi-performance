package com.example.springboot;


import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class JmeterExecute {

    public static void main(String[] args) throws Exception {
    Process process = Runtime.getRuntime().exec(
            new String[]{"cmd","/c","jmeter -n -t EverydayLoadTesting.jmx -l testresults.jtl"},
            null,
            new File("D:\\Personal\\apache-jmeter-5.4.1\\bin")
    );
    //A a = new A();

    Long processId = JmeterNewProcess.getProcessID(process);

    System.out.println("El ID del Proceso es: " + processId);
    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
    String line = "";
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }

    }


}
