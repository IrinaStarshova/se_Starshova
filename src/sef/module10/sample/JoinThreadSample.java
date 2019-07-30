package sef.module10.sample;

public class JoinThreadSample {

	private static int taskCount = 10;
	private static int delay = 100;
	
	public static void main(String arg[]){
		
		final Thread t1 = (new Thread("Printer1") {

			public void run() {
				for(int task = 0; task < taskCount ; task++){
					//notice that for every run printer2 always comes before printer1 on task 0,3,6,9
					//try running this again by commenting the statement below
					//you will notice that the above observation doesn't apply already
//					if(task % 3 == 0)
//						Thread.yield();
					System.out.println("Worker " + this.getName() + " doing task " + task);
					try{
						Thread.sleep(delay);
					}
					catch(InterruptedException ex){
						System.err.println("Unexpected interruption of thread " + Thread.currentThread().getName());
					}
				}
			}
		});

		final Thread t2 = (new Thread("Printer2") {

			public void run() {
				for(int task = 0; task < taskCount ; task++){
					System.out.println("Worker " + this.getName() + " doing task " + task);
					try{
						Thread.sleep(delay);
					}
					catch(InterruptedException ex){
						System.err.println("Unexpected interruption of thread " + Thread.currentThread().getName());
					}
				}
			}
		});
		
		
		final Thread t3 = (new Thread("Printer3") {

			public void run() {
				for(int task = 0; task < taskCount ; task++){
					try{
						//waits for t1 to die before executing
						t1.join();
						System.out.println("Worker " + this.getName() + " doing task " + task);
						Thread.sleep(delay);
					}
					catch(InterruptedException ex){
						System.err.println("Unexpected interruption of thread " + Thread.currentThread().getName());
					}
				}
			}
		});
		
		t3.start();
		t2.start();
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.start();
	}
}
