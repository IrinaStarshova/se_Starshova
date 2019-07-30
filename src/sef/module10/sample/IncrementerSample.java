package sef.module10.sample;

public class IncrementerSample {

	public static void main(String arg[]){
		Incrementer x = new Incrementer();
		x.setY(9);
		x.setX(9);
		//Note that both threads were given the  same Incrementer object x
		Thread a = new Thread(new ThreadIncrementer(x));
		a.setName(("A"));
		Thread b = new Thread(new ThreadIncrementer(x));
		b.setName(("B"));
		a.start();
		b.start();
	}
}
