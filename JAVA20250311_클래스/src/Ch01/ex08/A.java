package Ch01.ex08;

public class A {
	
	private String name;
	private int age;
	
	void funcA() {
		System.out.println("funcA()");
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}

	A(){}
	A(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age);
	}
}

class B extends A{
	private String address;
	
	B(){}
	B(String name, int age, String address){
		super(name, age); // 상위 클래스 생성자 호출
		this.address = address;
	}
	
	@Override //상위클래스에 있는 메소드를 재정의 하고 있다. (오타 방지)
	void info() {} //상위클래스가 가지고 있는 메소드 => 재정의, 오버라이딩
	
	void funcB() {
		System.out.println("funcB()");
	}
	
	void InfofuncB() {
		info();
		System.out.println(address);
	}
	
	void displayInfo() {
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge());
		System.out.println("출신: " + address);
		//private 사용하고 호출하는 방법 해결~!
	}
}
