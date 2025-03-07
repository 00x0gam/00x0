package ch08.ex01;

public class MemberMain {

	public static void main(String[] args) {

		Member M1 = new Member("김냄비", "kim","냄비", 20);
		
		M1.displayInfo();
		
		System.out.println();
		
		Member M2 = new Member("김냄비", "kim");
		
		M2.displayInfo();
	}

}
