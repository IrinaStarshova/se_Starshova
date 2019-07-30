package sef.test.message;

public class MMSMessage implements Message {
	
	String text;
	
	public MMSMessage(String text) {
		this.text = text;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "MMS: " + text;
	}

}
