package inheritance.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		
		
		SmartTV smartTV = new SmartTV();
		
		smartTV.onOff = true;
		smartTV.ch = 11;
		smartTV.bl = 30;
		smartTV.ip = "192.168.0.111";
		
	}

}

class BasicTV {
	
	boolean onOff;
	int ch;
	int bl;

	
}

class SmartTV extends BasicTV {

	String ip;
	
}

	