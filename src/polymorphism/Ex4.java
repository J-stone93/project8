package polymorphism;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		// 회원 생성 리스트
		ArrayList<Customer> customersList = new ArrayList<Customer>();
		
		Customer customer1 = new Customer("둘리"); //일반 회원
		Customer customer2 = new Customer("또치");
		Customer customer3 = new Customer("도우너");
		Customer customer4 = new VIPCustomer("마이콜"); //VIP 회원
		Customer customer5 = new VIPCustomer("고길동");
		
		customersList.add(customer1); //리스트에 회원 추가
		customersList.add(customer2);
		customersList.add(customer3);
		customersList.add(customer4);
		customersList.add(customer5);
		
		for (Customer customer : customersList) {
			customer.calcPrice(10000);
		}
		
		for (Customer customer : customersList) {
			customer.showInfo();
		}
		
		
	}

}
