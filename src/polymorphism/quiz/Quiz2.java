package polymorphism.quiz;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Customer> customersList = new ArrayList<Customer>();

		customersList.add(new Customer("둘리")); // 리스트에 회원 추가
		customersList.add(new GOLDCustomer("또치"));
		customersList.add(new VIPCustomer("도우너"));

		for (Customer customer : customersList) {
			customer.calcPrice(10000);
			customer.showInfo();
		}
	}

}

class Customer {

	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립률

	public Customer(String customerName) {
		this.customerName = customerName;
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

class GOLDCustomer extends Customer {

	double saleRatio;

	public GOLDCustomer(String customerName) {

		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public void calcPrice(int price) {

		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
	}

}

class VIPCustomer extends Customer {

	double saleRatio;

	public VIPCustomer(String customerName) {

		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override
	public void calcPrice(int price) {

		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
	}

}