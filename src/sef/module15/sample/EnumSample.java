package sef.module15.sample;

public enum EnumSample {


	//each constant is treated as an EnumSample object
	
	ONE(1), //the parameter 1 is passed to the constructor
	TWO(2),
	THREE(3),
	FOUR(4);
	
	private int x;
	
	private EnumSample(int x){
		this.x = x;
	}
	
	public int getX(){
		return x;
	}
	
	public static void main(String arg[]){
		EnumSample.valueOf("FOUR");
		for(EnumSample item : EnumSample.values()){
			
			System.out.println(item.getX());
		}
		System.out.println(EnumSample.ONE == EnumSample.ONE);
	}
}
