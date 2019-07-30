package sef.module15.sample;

public class UpperBound <E extends Number>{
	
	private E field;
	
	public void setField(E arg){
		field = arg;
	}
	
	public E getField(){
		return field;
	}
	
	public static void main(String arg[]){
		UpperBound<Float> g1 = new UpperBound<Float>();
		UpperBound<Integer> g2 = new UpperBound<Integer>();
		
		//Not legal: String is not a subclass of Number
		//GenericsWildCard<String> g2 = new GenericsWildCard<String>();
		Float f = 1.1f;

		g1.setField(new Float(1.1f));
		g2.setField(new Integer(42));
		//g2.setField("");
		System.out.println(g1.getField());
		System.out.println(g2.getField());		
		
	}
	
}
