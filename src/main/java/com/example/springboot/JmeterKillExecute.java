package com.example.springboot;

import com.example.springboot.JmeterFromCommands;
import java.io.File;

public class JmeterKillExecute {

    public static void main(String[] args) throws Exception {

        Process process = Runtime.getRuntime().exec(
                new String[]{"cmd", "/c", "taskkill /F /T /PID 23032"},
                null,
                new File("D:\\Personal\\apache-jmeter-5.4.1\\bin")
        );


    }
}
