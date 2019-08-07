package sef.module12.activity.myChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String []arg){
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 9999)){

            try (PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
                 Scanner input = new Scanner(System.in);
                 InputStreamReader inputStream= new InputStreamReader(socket.getInputStream())){

                new Thread (() -> {
                    try (BufferedReader in = new BufferedReader(inputStream)) {
                        String line;
                        while ((line = in.readLine()) != null)
                            System.out.println(line);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();

                while (true) {
                    if (input.hasNext()) {
                        String mes = input.nextLine();
                        out.println(mes);
                        if (mes.equalsIgnoreCase("exit")) {
                            input.close();
                            break;
                        }
                    }
                }
            } catch (UnknownHostException e) {
                e.printStackTrace();}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
