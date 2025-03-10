package Ch01.ex04;

class GrandParent{
	private String 할아버지성함;
	
	String get할아버지성함() {
		return 할아버지성함;
	}
	
	GrandParent(){}
	GrandParent(String 할아버지성함){
		this.할아버지성함 = 할아버지성함;
	}
}

class Parent extends GrandParent{//2개 생성자
	private int 아버지연세;
	
	int get아버지연세() {
		return 아버지연세;
	}
	
	Parent(){}
	Parent(String 할아버지성함, int 아버지연세){
		super(할아버지성함);
		this.아버지연세 = 아버지연세;
	}
}

class Child extends Parent{ //3개 생성자
	String 나의취미;
	
	Child(){}
	Child(String 할아버지성함, int 아버지연세, String 나의취미){
		super(할아버지성함, 아버지연세);
		this.나의취미 = 나의취미;
	}
	
	void displayInfo() {
		System.out.println("할아버지 성함: " + get할아버지성함());
		System.out.println("아버지 연세: " + get아버지연세());
		System.out.println("나의 취미: " + 나의취미);
		
	}
	
}

public class MainClass {

	public static void main(String[] args) {

		 Child child = new Child("김철수", 50, "야구");
		 child.displayInfo();
		 
		 /*
		  * 할아버지 성함 김철수
		  * 아버지 연세 50
		  * 나의 취미는 야구
		  */
	}

}
