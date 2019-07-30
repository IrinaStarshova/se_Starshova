package sef.module4.sample;

import java.util.Calendar;

public class Person {

	//Attributes
	private String name;
	private Calendar birthDate;
	
	
	//Behavior
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
	
}
