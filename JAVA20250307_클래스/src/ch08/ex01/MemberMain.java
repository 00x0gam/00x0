package ch08.ex01;

public class MemberMain {

	public static void main(String[] args) {

		Member M1 = new Member("김냄비", "kim","냄비", 20);
		
		M1.displayInfo();
		
		System.out.println();
		
		Member M2 = new Member("김냄비", "kim");
		//객체변수 password와 age를 적지 않아 null, 0가 뜬다.
		
		M2.displayInfo();
	}

}
