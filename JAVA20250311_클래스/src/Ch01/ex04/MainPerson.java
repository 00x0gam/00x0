package Ch01.ex04;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person("이포무", 25);
		Person p2 = new Person("김냄비", 12);
		
//		p1.displayInfo();
		System.out.println(p1.displayInfo());
		
		p1.setName("김냄비");
		p1.setage(1);
		System.out.println(p1.displayInfo());
		
		System.out.println();
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
	}

}
