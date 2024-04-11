package inheritance.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		Pen2 pen2 = new Pen2();
		
		pen2.penFont = 2;
		pen2.use = 1;
		pen2.color = "BLUE";
		
		Pen3 pen3 = new Pen3();
		
		pen3.penFont = 3;
		pen3.use = 0.8;
		pen3.brand = "몽블랑";		
	}

}

class Pen {
	
	int penFont;
	double use;

	
}

class Pen2 extends Pen {

	String color;
	
}

class Pen3 extends Pen {
	
	String brand;
	
} 

	