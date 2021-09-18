package com.example.springboot;


import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class JmeterExecute2 {

    public static void main(String[] args) throws Exception {
    Process process = Runtime.getRuntime().exec("java -version");
    //A a = new A();

    //Long processId = JmeterNewProcess.getProcessID(process);

    //System.out.println("El ID del Proceso es: " + processId);
    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
    String line = "";
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }

    }


}
