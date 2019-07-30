package sef.module4.sample;

public class StaticSample {
	
	public static int SHARED=1;
	public int notShared;
	
	private static float distance;
	private static float time;
	private static float speed;
	
	//static sample
	static
	{
		speed = distance / time;
	}
	
	@SuppressWarnings("static-access")
	public StaticSample(float distance, float time)
	{
		this.distance = distance;
		this.time = time;
	}
	
	public StaticSample() {
	}

	@SuppressWarnings("static-access")
	public static void main(String arg[]){
		//static sample
		StaticSample temp1  = new StaticSample();
		StaticSample temp2  = new StaticSample();
		
		temp1.SHARED = 99;
		temp1.notShared = 1;
		
		temp2.SHARED = 100;
		temp2.notShared = 2;
		
		System.out.println(temp1.SHARED);
		System.out.println(temp1.notShared);
		System.out.println(temp2.SHARED);
		System.out.println(temp2.notShared);
		
		//static code block sample
		StaticSample temp3  = new StaticSample(100, 4);
		System.out.println(temp3.distance);
		System.out.println(temp3.time);
		System.out.println(temp3.speed);
	}
}
