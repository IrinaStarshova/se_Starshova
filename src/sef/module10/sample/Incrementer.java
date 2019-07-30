package sef.module10.sample;

public class Incrementer {

	private int x;
	private int y;
	
	//See the effects with and without the synchronized keyword
	public synchronized boolean increment(){
		
		if(x == 10){
			return false;
		}
		
		//The sleep here is to encourage the possibility of Thread interleaving
		try{
			Thread.sleep(100);
		}
		catch(InterruptedException ex){
			//do nothing
		}
		x++;
		return true;
	}
	
	public boolean incrementWithoutSync(){
		
		if(y == 10){
			return false;
		}
		
		//The sleep here is to encourage the possibility of Thread interleaving
		try{
			Thread.sleep(100);
		}
		catch(InterruptedException ex){
			//do nothing
		}
		y++;
		return true;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
}
