package sef.module6.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person implements Speaker{

	//Attributes
	private String name;
	private Calendar birthDate;
	
	//Behavior
	public Person(){
		this.name="Unknown";
		this.birthDate = Calendar.getInstance();
		System.out.println("I'm Person constructor"); // Called when creating a Person instance
	}
	
	public Person(String name, Calendar birthDate){
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}	
	
	public String introduce(){
		return "My name is " + name;
	}
	
	@Override
	public String toString() {
		
		Date date = birthDate.getTime();
		SimpleDateFormat sfd = new SimpleDateFormat("MM/dd/yyyy");
		return name+"\n"+sfd.format(date) ;
	}
}
