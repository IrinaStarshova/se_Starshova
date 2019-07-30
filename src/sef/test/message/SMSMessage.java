package sef.test.message;

public class SMSMessage implements Message {
	
	private String text;
	
	public SMSMessage(String text) {
		this.text = text;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "SMS: " + text;
	}
	
	

}
