package sef.module15.sample;
import java.lang.reflect.Method;;

public class FindMyTask {
	public static void main(String[] args) throws Exception {
		
		System.out.println("Here are the tasks assigned To Luis Chua");
		
		//get all the methods in AnnotationsSample.java
		for (Method m : Class.forName("sef.module15.sample.AnnotationsSample").getMethods()) {
			//check if Task Annotation Type is declared in the method
			if (m.isAnnotationPresent(Task.class)) {
				Task value = m.getAnnotation(Task.class);
				if (value.assignedTo().equals("Luis Chua"))
					System.out.println("Method: "+m.getName());
			}
		}
   }
}
