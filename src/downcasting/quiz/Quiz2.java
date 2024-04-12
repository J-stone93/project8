package downcasting.quiz;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Student("둘리"));
		list.add(new Employee("또치"));

		for (Person person : list) {
			person.eat();
			
			if (person instanceof Student) {
				Student student = (Student) person;
				student.study();
			} else if (person instanceof Employee) {
				Employee employee = (Employee) person;
				employee.walk();
			}
				
		}
	}

}
class Person {
	
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name + " 밥을 먹는다.");
	}
	
}

class Student extends Person{

	public Student(String name) {
		super(name);
		
	}
	public void study() {
		System.out.println(name + " 학생이 공부를 한다.");
	}
	
	
}	


class Employee extends Person{

	public Employee(String name) {
		super(name);
		
	}
	public void walk() {
		System.out.println(name + " 회사원이 공부를 한다.");
	}
	
}	
	

