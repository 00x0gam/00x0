package Ch01.ex09;

public class Main {

	public static void main(String[] args) {

		C c1 = new C("고새싹", "호주", 5);
		c1.test();
		
		B b1 = new B("김냄비", "스트릿출신");
		b1.test();
		
		A a1 = new A("콩물이");
		a1.test();
		
		System.out.println();
		c1.displayInfo();
	}

}
