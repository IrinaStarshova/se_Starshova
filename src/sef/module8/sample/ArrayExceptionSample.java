package sef.module8.sample;

public class ArrayExceptionSample {

	public static void main(String arg[]){
		
		//the valid indeces for an array like this is from 0 to 4
		int scores[] = new int[5];
		
		//but the the loop below will run from 0 to 5
		//size of array is 5 last index is 4 so accessing 
		//scores[5] will cause an exception
		for(int i  = 0; i < 5; i++){
			System.out.println(scores[i]);
		}
	}
}
