package sef.module12.activity.myChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class User implements Runnable {
    private String name;
    private Socket client;
    private BufferedReader input;
    private PrintWriter output;

    User(String name, Socket client) throws IOException {
        this.name = name;
        this.client = client;

        System.out.println("new user " + this.name + " connected from " + client.getInetAddress().toString());
        Server.sendToAll(this.name + " logon", this);
        input = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
        output = new PrintWriter(this.client.getOutputStream(),true);
        output.println("You have reached server " + this.name + ". Have a nice day!\nEnter your message or type 'exit' to exit");
    }

    @Override
    public void run() {this.start();}
    public void start() {
        try {
            String line;
            while ((line= input.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                if(Server.getClientsCount()>1)
                    Server.sendToAll(name + ": " + line, this);
            }
            System.out.println("user " + name + " disconnected");
            close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void send(String message) {
        try {
            output.println(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void close() {
        try {
        if(Server.getClientsCount()>1)
            Server.sendToAll(name + " logout", this);
        Server.removeClient(this);
        if(output!= null)
            output.close();
        if(input!= null)
            input.close();
        if(client!= null)
            client.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
