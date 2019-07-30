package sef.module8.sample;

public class AssertSample {

	public static void test()
	{
		assert 5%2 == 1;
		assert 6%2 == 1 : "This is wrong!!!";
	}
	public static void main(String arg[]){
		AssertSample.test();
		
	}			
}
