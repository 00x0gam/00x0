package ch01.ex01;

/*
 * ######상속 전제 조건######
 * 하위 클래스는 상위 클래스 자원 접근 가능(private 제외)
 * 상위 클래스는 하위 클래스 접근 불가
 */
public class Main {

	public static void main(String[] args) {

		C c1 = new C("김냄비", "스트릿출신", 12);
		c1.funcA();
		c1.funcB();
		c1.funcC();
		System.out.println();
		
		B b1 = new B("고새싹", "호주");
		b1.funcA();
		b1.funcB();
//		b1.funcC(); 얜 못혀
		System.out.println();
		
		A a1 = new A("콩물이");
		a1.funcA();
//		a1.funcB(); 얜 못혀
//		a1.funcC(); 얜 못혀
		
		System.out.println("--------자동타입변환--------");
		/*
		 * 상위 클래스는 하위 클래스를 참조할 수 있다.
		 * 단, 하위 클래스 자원에는 접근 불가
		 * 자신 클래스만 접근 가능
		 */
		
//		 B b2 = new B("삼색이", "금곡");
//		 A a2 = (A)b2;
		 
		 A a2 =  new B("춘봉이", "스트릿출신"); //참조까지 가능
		 a2.funcA();
//		 a2.funcB(); 사용 불가 - 자기 것만 가능
		 
		 A a3 = new C("김첨지", "스트릿 출신", 5);
		 a3.funcA();
		 
		 System.out.println("--------강제타입변환--------");
//		 강제 타입 반환 안되는 경우
//		 A a5 = new A();
//		 B b3 = new B();
//		 b3 = (B)a5;
//		 b3.funcA();
		 
//		 강제 타입 반환이 되는 경우
		 A a6 = new B();
		 B b4 = new B();
		 b4 = (B)a6;
		 b4.funcA();
		 System.out.println();
		 
		 A a7 = new C();
		 B b5;
		 // b5가 어디에 있길래 할 수 있겠음?
		 // 걍 한 번에 담겨 있어서 가능인가? 오...
		 
		 b5 = (B)a7;
		 b5.funcA();
		 b5.funcB();
		 System.out.println();
		 
		 A a8 = new C();
		 C c2 = (C)a8; //ok

		 A a10 = new A();
		 B b6 = new B();
		 
		 a10 = b6;
		 B b7 = (B)a10;
		 
		 // a10는 A, b6는 B에 있는 상태에서
		 // a10 = b6이다. (같은 메모리?)
		 // b7이 (B)a10으로 강제 변환한다 해도
		 // B에 접근할 수 있어 가능하다.
		 
	}

}
