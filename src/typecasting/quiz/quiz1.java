package typecasting.quiz;

public class quiz1 {

	public static void main(String[] args) {
		
		Perent pc = new Child("한국", "고", "길동");
		
		System.out.println(pc.lastName);
		System.out.println(pc.nationality);
		
		// pc변수로 자식클래스의 firstName은 사용할 수 없음
//		System.out.println(pc.firstName);
	}

}
class Perent {
	
	String nationality;
	String lastName;
	
	public Perent(String nationality, String lastName) {
		super();
		this.nationality = nationality;
		this.lastName = lastName;
	}
	
}

class Child extends Perent{
	
	String firstName;

	public Child(String nationality, String lastName, String firstName) {
		super(nationality, lastName);
		this.firstName = firstName;
	}
	
}




