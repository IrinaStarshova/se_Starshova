package sef.module10.sample;

public class MultiThreadSample {
	//even though it seems that every thread is executing one loop at a time in this
	//example but if you see the sequence of name you will notice that some doesn't follow
	//the Curly Larry Moe sequence
	public static void main(String arg[]){
		
		MultiThreadWorker curlyWorker = new MultiThreadWorker("Curly", 12, 100);
		MultiThreadWorker larryWorker = new MultiThreadWorker("Larry", 8, 100);
		MultiThreadWorker moeWorker = new MultiThreadWorker("Moe", 5, 100);
		
		Thread curlyThread = new Thread(curlyWorker);
		Thread larryThread = new Thread(larryWorker);
		Thread moeThread = new Thread(moeWorker);
		
		curlyThread.start();
		larryThread.start();
		moeThread.start();
		
		System.out.println(Thread.currentThread().getName() + " is ended");
	}
}
