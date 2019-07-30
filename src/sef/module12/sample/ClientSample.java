package sef.module12.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSample {

	public static void main(String arg[]){
		
		
		try {
			//Instantiate an instance of the Socket class and pass the network address and the port of the server the application.
			Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
			
			//Retrieve input or output streams bound to the socket.
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
					socket.getInputStream()));
			
			String line="";
			while ((line= in.readLine()) != null)
				System.out.println(line);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
