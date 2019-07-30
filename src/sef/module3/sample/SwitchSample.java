package sef.module3.sample;

public class SwitchSample {

	public static void main(String[] args) {
		
		char theLetter = 'b';
		
		switch(theLetter){
			case 'a': System.out.print("The letter chosen is 'a'"); break;
			case 'b': System.out.print("The letter chosen is 'b'"); break;
			case 'c': System.out.print("The letter chosen is 'c'"); break;
			case 'd': System.out.print("The letter chosen is 'd'"); break;
			case 'e': System.out.print("The letter chosen is 'e'"); break;
			default : System.out.print("The letter is not a valid choice");
		}
	}
}
