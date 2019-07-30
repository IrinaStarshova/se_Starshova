package sef.module6.sample;

public class Student extends Person{

	private String school;
	private int grade;
	
	public Student(){ 
		System.out.println("I'm Student constructor"); //Called when creating an Student instance
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	//this is an example of method overriding
	public String introduce(){
		String s = super.introduce();//this invoke the introduce method of the Person
		s = s + "\nI am in grade " + grade + " and studying in " + school;
		return s;
	}
	
}
