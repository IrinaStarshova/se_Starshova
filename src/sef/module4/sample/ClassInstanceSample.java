package sef.module4.sample;

import java.util.Calendar;

public class ClassInstanceSample {

	static {
		System.out.println("This is executed as the class is loaded by the JVM");
	}
	
	public static void main(String arg[]){
		
		
		//Object instance creation using a static method
		//called 'factory' methods.
		Calendar bDay1  = Calendar.getInstance();
		Calendar bDay2 = Calendar.getInstance();
		bDay1.set(1977, 8, 13);
		bDay2.set(1981, 7, 11);
		
		//Object instance creation using 'new' and passing parameters to constructors
		Person him = new Person("John Doe",bDay1);
		Person her = new Person("Jane Doe", bDay2);
		
		//Access an object's member method to invoke a behavior
		System.out.println(him.introduce());
		System.out.println(her.introduce());
		
		// Access and Set the object's attribute using it's setter and getter
		him.setName("John");
		String name = him.getName();
		System.out.println(name);
		
		//This will cause the object pointed by 'her' to be garbage collected
		//since there are no more remaining references to that object
		her = null;
		
		
	}
}
