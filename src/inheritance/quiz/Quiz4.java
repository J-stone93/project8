package inheritance.quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		Monster monster = new Monster();
		
		monster.showInfo();
		monster.att();
		
		Slime slime = new Slime();
		
		slime.showInfo();
		slime.att();
		slime.skilluse();
		
		
	}

}

class Monster {
	
	int power;
	int hp;
	
	public Monster() {
		power = 10;
		hp = 100;
	}
	
	public void att() {
		System.out.println("몬스터가 " + power + "만큼 공격한다!");
	}
	
	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + power + "이고 " + "체력은 " + hp + "이다");
	}
}

class Slime extends Monster{
	
	String skill;
	
	public Slime() {
		skill = "마비";
		power = 30;
		hp = 200;
	}
	
	public void skilluse() {
		System.out.println("슬라임이 " + skill + "을 시전한다!");
	}
}





