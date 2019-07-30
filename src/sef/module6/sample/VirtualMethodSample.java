package sef.module6.sample;

public class VirtualMethodSample {
	public static void main(String arg[]){
		Person p = new Person();
		p.setName("John Doe");
		
		//Student inherits the methods and behavior from the Person class
		Student s = new Student();
		s.setName("Jane Doe");
	
		s.setSchool("A Fictional School");
		s.setGrade(10);
	
		rollCall(p);
		rollCall(s);
	}
	
	public static void rollCall(Person temp){
			System.out.println(temp.introduce());
	}
}
