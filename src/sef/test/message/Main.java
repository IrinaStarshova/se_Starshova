package sef.test.message;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Message sms = new SMSMessage("This subscriber asks to recall!");
		
		Message mms = new MMSMessage("Let him call himself");
		send(mms);
		send(sms);
		
		
		
		
		
		// TODO Auto-generated method stub

	}
	
	public static void send(Message m) {
		if(m instanceof SMSMessage ){
			System.out.println("1: - " + m.getText());
			
		}
		if(m instanceof MMSMessage ){
			System.out.println("2: - " + m.getText());
			
		}
		
	}

}
