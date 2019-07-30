package sef.module11.sample;

public class StringBuilderVsStringBuffer {
	String sample = "A";
	int count = 10000000;
	int count2 = 50000;
	
	public static void main(String arg[]){
		new StringBuilderVsStringBuffer();
	}
	
	public StringBuilderVsStringBuffer()
	{
		//there is a performance gain using builder
		builder(count);
		buffer(count);
		
		//don't use concatenation because its slow
		builder(count2);
		concatenation(count2);
	}
	
	public void builder(int count)
	{
		StringBuilder builder = new StringBuilder();
		long start = System.currentTimeMillis();
		for(int i=0; i<count; i++)
			builder.append(sample);
		System.out.println(builder.toString().length());
		System.out.println("Builder Execution Time: "+(System.currentTimeMillis() - start));		
	}
	
	public void buffer(int count)
	{
		StringBuffer buffer = new StringBuffer();
		long start = System.currentTimeMillis();
		for(int i=0; i<count; i++)
			buffer.append(sample);
		System.out.println(buffer.toString().length());
		System.out.println("Buffer Execution Time: "+(System.currentTimeMillis() - start));	
	}
	
	public void concatenation(int count)
	{
		String temp = "";
		long start = System.currentTimeMillis();
		for(int i=0; i<count; i++)
			temp += sample ;
		System.out.println(temp.length());
		System.out.println("Concat Execution Time: "+(System.currentTimeMillis() - start));		
	}
}
