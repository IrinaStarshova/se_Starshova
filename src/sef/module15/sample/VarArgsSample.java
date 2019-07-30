package sef.module15.sample;

public class VarArgsSample {

	public static void main(String arg[]) {
		String[] arrays = {"John Doe", "Jane Doe", "Juan dela Cruz"};
		
		//Auto converted into an array
		listNames("John Doe");
		listNames("John Doe", "Jane Doe", "Juan dela Cruz");
		
		//Array
		listNames(arrays);
	}
	
	//If there are other arguments in the method, the others cannot be varargs and the vararg must be the last parameter in the list.
	public static void listNames(String... names) {
		// the parameter names is actually an array of Strings
		for (String i : names) {
			System.out.println(i);
		}
	}
}
