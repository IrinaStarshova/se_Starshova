package sef.module15.sample;


public 	class Employee {
	private String name;
	private int id;

	public Employee(String name, int id){
		this.name = name;
		this.id=id;
	}
	
	public int getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}
}
