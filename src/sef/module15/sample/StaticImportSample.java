package sef.module15.sample;

//import static java.lang.Math.PI;
import static java.lang.Math.*;
//import static java.lang.Math.sqrt;

import java.util.Calendar;
import java.util.Date;
public class StaticImportSample 
{
   @SuppressWarnings("deprecation")
public static void main(String args[]) 
   {
	 
	   //Use the fields in the Math class directly
	  System.out.println("The sin of Pi/4 is about " +Math.sin(PI / 4));
	  System.out.printf("The sin of Pi/4 is about %f\n",Math.sin(PI/4));
	  System.out.print("\n");
	  System.out.println("PI is approximately " + Math.PI);
	  System.out.printf("PI is approximately %f\n",PI);
	  System.out.print("\n");
	  System.out.println("The square root of 25 is " + sqrt(25));
	  System.out.printf( "The square root of 25 is %.1f", sqrt(25.0) );
      
	  Date date = new Date();
	  date.getDate();
	  
	  Calendar c = Calendar.getInstance();
	  date = c.getTime();
	  System.out.println(date);
     
   } 
   
   @Override
   public String toString(){
	   return "hello";
   }
  
} 