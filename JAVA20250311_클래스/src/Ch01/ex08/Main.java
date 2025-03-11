package Ch01.ex08;

public class Main {

	public static void main(String[] args) {

			A aa = new A();
			aa.funcA();
			
			B bb = new B();
			bb.funcB();
			
			B b2 = new B("김냄비", 12, "스트릿출신");
			b2.info(); //=> 재정의 후: 깊게 갈 필요 없잖아?
			
			System.out.println();
			b2.InfofuncB();
			//=> 재정의 후: 깊게 갈 필요 없잖아? 그냥 옆에 있는 거 퍼올게
			
			System.out.println();
			b2.displayInfo();
			
		
	}

}
