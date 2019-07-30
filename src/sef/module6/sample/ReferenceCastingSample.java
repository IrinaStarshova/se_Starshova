package sef.module6.sample;

public class ReferenceCastingSample {

	public static void main(String arg[]){
		
		Student s = new Student();
		s.setName("Jane Doe");
		s.setSchool("A Fictional School");
		s.setGrade(10);
		
		// Sample reference casting
		Person person = new Student();
		Student tempPerson = (Student) person; // convert student to person
		System.out.println(tempPerson.introduce());
		Person tempStudent = tempPerson; // convert person to student
		System.out.println(tempStudent.introduce());
	}
}
