package sef.module12.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLSample {
	
	public static void main(String arg[]){
		try {
			URL yahooURL = new URL("http://www.google.com");
			System.out.println(yahooURL.getProtocol());
			System.out.println(yahooURL.getHost());
			
			
			URLConnection connection = yahooURL.openConnection();
			
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
					connection.getInputStream()));

			String inputLine;

			while ((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			
			in.close();
			
//			connection.setDoOutput(true);
//		    OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
//		    out.write("Hello!");
//			in.close();
//			out.close();

		} catch (MalformedURLException e) {
		
			e.printStackTrace();
		} catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
