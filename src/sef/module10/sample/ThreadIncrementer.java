package sef.module10.sample;

public class ThreadIncrementer implements Runnable{
	
	private Incrementer inc;
	
	public ThreadIncrementer(Incrementer inc){
		this.inc = inc;
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName() + " attempting to incremement WithoutSync.." + inc.incrementWithoutSync());
		System.out.println(inc.getY());	
		System.out.println(Thread.currentThread().getName() + " attempting to incremement.." + inc.increment());
		System.out.println(inc.getX());
	}

}
