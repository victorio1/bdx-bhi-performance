package com.example.springboot;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSpringBoot {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Port number to bind server to.
        int portNum = 11113;

        // Socket for server to listen at.
        ServerSocket listener = new ServerSocket(portNum);

        System.out.println("Server is now running at port: " + portNum);

        // Simply making Server run continously.
        while (true) {
            try {
                // Accept a client connection once Server recieves one.
                Socket clientSocket = listener.accept();

                // Creating inout and output streams. Must creat out put stream first.
                if(clientSocket != null){
                    ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                    ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());


                    //Sending response back to client
                    String response = "Integer Object Received.";
                    out.writeObject(response);

                    Process process = Runtime.getRuntime().exec(
                            new String[]{"cmd","/c","jmeter -n -t EverydayLoadTesting.jmx -l testresults.jtl"},
                            null,
                            new File("D:\\Personal\\apache-jmeter-5.4.1\\bin")
                    );

                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    String line = "";
                    while ((line = reader.readLine()) != null) {
                        out.writeObject(line);
                    }
//                    out.close();
//                    in.close();
//                    clientSocket.close();
//                    break;
                }

            }  catch (Exception e){

            }
        }
    }

}
