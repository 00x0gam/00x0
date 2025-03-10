package Ch01.ex01;

class A{
	String name;
	int age;
	
	A(){}
	A(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void run() {
		System.out.println("run()");
	}
	
	void eat() {
		System.out.println("eat()");
	}
}

// B 클래스가 상위 클래스인 A 클래스를 상속하겠다. => extends
class B extends A{
	String id;
	
	B(){} //c가 상속 받는 b, 아이디 값을 전달할 곳이 필요해서 b 생성자를 만들어줘야한다.
	B(String name, int age, String id){
		super(name, age); // 상속 받은 값 super에 넣기
		this.id = id;
	}
}

//C는 B도 상속 받고 A도 상속 받는다.
final class C extends B {
	String pw;
	
	C(){}
	C(String name, int age, String id, String pw){
		super(name, age, id); // 상속 받은 값 super에 넣기
		this.pw =pw;
	}
	
	void displayInfo() {
		System.out.println("A class : " + name);
		System.out.println("A class : " + age);
		System.out.println("B class : " + id);
		System.out.println("C class : " + pw);
	}
}

//class D extends C {} //오류 생긴다.

public class Main {

	public static void main(String[] args) {
		
		C c = new C("홍길동", 20, "test", "1234");
		c.displayInfo();
	
	}

}