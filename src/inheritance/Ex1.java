package inheritance;

public class Ex1 {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.nationality = "한국"; //부모 클래스에서 물려 받음
		
		child.lastName = "고"; //부모 클래스에서 물려 받음
		
		child.firstName = "길동";

	}

}

class Parents {
	
	String nationality;
	String lastName;
	
}

class Child extends Parents {
	
	String firstName;
	
	
	
}










