package Ch01.ex03;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person("이포무", 25);
		Person p2 = new Person("김냄비", 12);
		
		p1.displayInfo();
		System.out.println(p1.displayInfo());
		
		System.out.println();
		Person p3 = new Person();
		System.out.println(p3.displayInfo());
		
		System.out.println();
		Person p4 = new Person("미니");
		System.out.println(p4.displayInfo());
		
		
		/* p1=p2
		 * 합칠 수 있다~
		 * p1, p2는 p2가 참조하는 개체를 동시 참조하게 됨
		 * 
		 * p1이 참조하는 객체는 일정시간 지나면 메모리 공간에서
		 * 소실된다. => 가비지
		 */
	}

}
