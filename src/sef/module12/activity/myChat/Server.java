package sef.module12.activity.myChat;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    private static List<User> clients = new ArrayList<>();

    public static void main(String[] args) {
        ServerSocket server=null;
        Socket client=null;
        final int port = 9999;
        try {
            server = new ServerSocket(port, 50, InetAddress.getLocalHost());
            System.out.println("ServerSocket created at " + server.getInetAddress().getHostAddress());
            System.out.println("Waiting for connection");

            while (true) {
                client = server.accept();
                User user = new User("user_" + (clients.size()+1),client);
                clients.add(user);
                Thread thread = new Thread(user);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(client!=null)
                    client.close();
                if(server!=null)
                    server.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    static void sendToAll(String message, User user) {
        for (User curUser : clients) {
            if (!user.equals(curUser)) {
                curUser.send(message);
            }
        }
    }
    static void removeClient(User client) {
        clients.remove(client);
    }
    static int getClientsCount()
    {
        return clients.size();
    }
}
