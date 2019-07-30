package sef.module6.sample;

public abstract class AbstractSample {
	private int age;
	
	//abstract methods have no implementation
	public abstract String getName();
	
	public abstract void setName(String name);
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
