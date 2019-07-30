package sef.module3.sample;

public class ForLoopSample {
	
	public static void main(String[] args) {
		
		//	Prints the value of i
		for(int i = 0; i < 10; i++)
			System.out.println("The value of i is : " + i);
		
		System.out.println();
		//	Prints a 5 by 10 grid
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 10; j++)
				System.out.print("* ");
			System.out.println();
		}
		
	}
}
