package inheritance;

public class Ex3 {

	public static void main(String[] args) {

		Cutomer cutomer = new Cutomer();
		cutomer.customerName = "둘리";
		cutomer.calcPrice(10000);
		cutomer.showInfo();
		
		VIPCustomer vip = new VIPCustomer();
		vip.customerName = "또치";
		vip.calcPrice(10000);
		vip.showInfo();
		
	}

}

class Cutomer {

	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립률

	public Cutomer() {

		customerGrade = "SILVER"; // 고정값이니까 초기화해줌
		bonusRatio = 0.01;

	}

	// 포인트 적립하고, 지불 가격을 계산하는 메소드
	public void calcPrice(int price) {

		bonusPoint = bonusPoint + (price * bonusRatio); // 보너스 포인트 계산
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");

	}

	public void showInfo() {

		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.");
	}
}

class VIPCustomer extends Cutomer {

	double saleRatio;

	public VIPCustomer() {

		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

}
