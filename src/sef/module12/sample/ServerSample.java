package sef.module12.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSample {
	
	public static void main(String arg[]){
		
		ServerSocket server=null;
		Socket client=null;
		PrintWriter out=null; 
		boolean endless=true;
		int port=9999;
		try {
			//Instantiate a ServerSocket instance and bind it to a specific port number
			server = new ServerSocket(port, 50, InetAddress.getLocalHost());
			
			System.out.println("ServerSocket created at " + server.getInetAddress().getHostAddress());
			System.out.println("Waiting for connection");
			while(endless){
				//The accept() method will block the thread until a connection is made.
				client = server.accept(); //Wait for a connection from a client
				
				System.out.println("Got a connection from " + client.getInetAddress()); //Print message if somebody connect with server
				
				//Use the returned Socket object to obtain an output or input stream to the client.
				out = new PrintWriter(
	                    client.getOutputStream(), true);
				
				out.println("You have reached server " + client.getInetAddress() + " I can't really do anything right now, so goodbye, and have a nice day!");	
				out.close();
				client.close();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
			if(out != null)
				out.close();
			
			if(client != null)
				client.close();
			
			if (server != null)
				server.close();
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
}
