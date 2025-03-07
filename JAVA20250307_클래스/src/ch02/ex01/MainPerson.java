package ch02.ex01;

public class MainPerson {

	public static void main(String[] args) {

		Person p1
		    = new Person("이은지");
		
//		p1.name = "김감자"; 멤버변수는 private 때문에 외부 접근 불가
		
//		p1.run();
		p1.eat();
	
		Person p2 = new Person("김냄비", 20, "010-1111-2222");
		
		p2.eat();
		
//		Person p3 = new Person();
		
		p2.setName("콩물이");
		p2.eat();
		p2.setAge(100);
		
		String name = p2.getName(); //콩물이로 이름 바뀜
		int age = p2.getAge();
		System.out.println(name);
		System.out.println(age);
	}

}
