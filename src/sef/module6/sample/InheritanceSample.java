package sef.module6.sample;

public class InheritanceSample {

	
	
	
	@Override
	public String toString() {
		
		return "Hello";
	}
	
	public static void main(String arg[]){
		
		Person p = new Person();
		p.setName("John Doe");
		
		//Student inherit the methods and behavior from the Person class
		Student s = new Student();
		s.setName("Jane Doe");
		
	    //notice that setName method is defined in Person class
		//and is not defined in Student class. Since Student class is the 
		//subclass of Person Class every public and protected fields and methods
		//of Person Class are automatically inherited.  
		
		s.setSchool("A Fictional School");
		s.setGrade(10);
		
		System.out.println("Student Name" + s.getName());
		System.out.println("School" + s.getSchool());
		
		System.out.println("\n" + p.introduce());
		//System.out.println("\n" + s.introduce());
		
		// Compilation error if Person's attribute is access directly 
		// since it is marked as private.
		// Attribute with private modifier is not visible to subclasses
		// It can be accessed through it's getter and setter which will be
		// explained in the next module.
		//System.out.println(p.getName());
		System.out.println(p);
		
		
		
	}
}
