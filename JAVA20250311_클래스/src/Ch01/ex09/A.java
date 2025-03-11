package Ch01.ex09;

public class A {
	private String name;
	
	String getName() {
		return name;
	}
	
	A(){}
	A(String name){
		this.name = name;
	}
	
	void test() { // 재정의 할게
		System.out.println("A()");
	}
	
}

class B extends A{
	private String address;
	
	String getAddress() {
		return address;
	}
	
	B(){}
	B(String name, String address){
		super(name);
		this.address = address;
	}
	@Override
	void test() { // 재정의 할게
		System.out.println("B()");
	}
	
}

class C extends B{
	private int age;
	
	C(){}
	C(String name, String address, int age){
		super(name, address);
		this.age = age;
	}
	@Override
	void test() { // 재정의 할게
//		super.test(); // 이게 뭐고;;!!!
		System.out.println("C()");
	}
	
	void displayInfo() {
		System.out.println("이름: " + getName());
		System.out.println("주소: " + getAddress());
		System.out.println("나이: " + age);
	}
}
