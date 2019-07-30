package sef.module10.sample;

public class MultiThreadWorker implements Runnable{
	
	private String name;
	private int taskCount;
	private int delay;
	
	public MultiThreadWorker(String name, int taskCount, int delay){
		this.name = name ;
		this.taskCount = taskCount;
		this.delay = delay;
		
	}

	public void run(){
		work(taskCount);
	}
	

	public void work(int taskCount){
		for(int task = 0; task < taskCount ; task++){
			System.out.println("Worker " + name + " doing task " + task);
			try{
				Thread.sleep(delay);
			}
			catch(InterruptedException ex){
				System.err.println("Unexpected interruption of thread " + Thread.currentThread().getName());
			}
		}
	}
}
