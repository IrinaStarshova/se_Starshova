package sef.module7.sample;

import java.util.Date;

public class PersonSampleThree{

	@SuppressWarnings("unused")
	private String name;
	private Date birthDate;
	
	public PersonSampleThree(String name, Date birthDate){
		setName(name);
		setBirthDate(birthDate);
	}
	
	public final void setBirthDate(Date birthDate){
		
		Date today = new Date();
		
		if(birthDate.compareTo(today) < 0){
			throw new IllegalArgumentException("Date/Time cannot be earlier than the current date/time");
		}
		
//		Create a new instance, don't use the instance passed
		birthDate = new Date(birthDate.getTime());
	}
	
	public Date getBirthDate(){
		return new Date(birthDate.getTime());
	}
	
	public final void setName(String name){
		if(name == null){
			throw new IllegalArgumentException("Name cannot be null!");
		}
		this.name = name;
	}
	
	public  String getName(String name){
		return name;
	}
	

}
