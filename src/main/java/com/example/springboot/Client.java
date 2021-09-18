package com.example.springboot;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

    public static void main(String arg[]) throws IOException, ClassNotFoundException {

        int portNum = 11113;

        Socket socket = new Socket("localhost", portNum);

        // Integer Object to send to Server.
        Integer num = new Integer(50);

        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

        while(true){
            String response = (String) in.readObject();
            System.out.println("Server message: " + response);
        }



        //socket.close();

    }

}
