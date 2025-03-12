package ch01.ex02;

/*
 * ######상속 전제 조건######
 * 하위 클래스는 상위 클래스 자원 접근 가능(private 제외)
 * 상위 클래스는 하위 클래스 접근 불가
 */
public class Main {

	public static void main(String[] args) {

		A a1 = new A();
		a1.test();
		
		B b1 = new B();
		b1.test(); // 내가 가지고 있는 것부터 먼저!
		
		C c1 = new C();
		c1.test(); // 내가 가지고 있는 것부터 먼저!
		
		System.out.println("---------다향성----------");
		
		/*
		 * C class
		 * 상속 상위 클래스 C에 소속된 A a2
		 * 
		 * test A, test B, test C
		 * 원래 예상을 한다면 A class가 뽑힐 것같은데
		 * 예외가 있다.
		 * 
		 * 오버라이딩이 되어 있다는 가정하애
		 * 참조되고 있는 클래스로 출력이 된다.
		 * 
		 */
		
		A a2 = new C();
		a2.test();
		
		A a3 = new B();
		a3.test();
		
		B b2 = new C();
		b2.test();
		
	}

}
