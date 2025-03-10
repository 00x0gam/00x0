package Ch01.ex05;

class GrandParent{
	private String 할아버지성함;
	
	GrandParent(){}
	GrandParent(String 할아버지성함){
		this.할아버지성함 = 할아버지성함;
	}
	
	void displayInfo() {
		System.out.println("할아버지 성함: " + 할아버지성함);
    }
}

class Parent extends GrandParent{//2개 생성자
	private int 아버지연세;
	
	Parent(){}
	Parent(String 할아버지성함, int 아버지연세){
		super(할아버지성함);
		this.아버지연세 = 아버지연세;
	}
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("아버지 연세: " + 아버지연세);
	}
}

class Child extends Parent{ //3개 생성자
	private String 나의취미; // 본인 클래스에서 쓰는 거라 노상관
	
	Child(){}
	Child(String 할아버지성함, int 아버지연세, String 나의취미){
		super(할아버지성함, 아버지연세);
		this.나의취미 = 나의취미;
	}
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("나의 취미: " + 나의취미);
		
	}
	
}

public class MainClass {

	public static void main(String[] args) {

		 Child child = new Child("김철수", 50, "야구");
		 child.displayInfo();
		 
		 System.out.println();
		 /*
		  * 할아버지 성함 김철수
		  * 아버지 연세 50
		  * 나의 취미는 야구
		  */
		 
		 Parent p1 = new Parent("홍길동", 100);
		 p1.displayInfo();
	}

}
