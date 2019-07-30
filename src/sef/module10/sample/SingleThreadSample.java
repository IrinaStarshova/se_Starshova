package sef.module10.sample;

public class SingleThreadSample {
	
	public static void main(String arg[]){
		
		SingleThreadWorker curlyWorker = new SingleThreadWorker("Curly");
		SingleThreadWorker larryWorker = new SingleThreadWorker("Larry");
		SingleThreadWorker moeWorker = new SingleThreadWorker("Moe");
		
		curlyWorker.work(5);
		larryWorker.work(5);
		moeWorker.work(5);
	}
}
