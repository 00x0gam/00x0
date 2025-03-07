package ch02.ex01;

public class Person {
	
	/* (private 있을 때)멤버변수
	 * => 값 세팅하는 방법
	 * 
	 * 1. 생성자
	 * 2. setter
	 * 3. getter
	 */
	
	private String name;
	private int age;
	private String phone;
	
	//디폴트 생성자
	//=> 처음에 생성자를 만들었음 java일 안하니깐 기본 생성자는 걍 만들어주셈
	public Person() {
		System.out.println("Person()");
	}
	
	//생성자
	public Person(String n) {
		System.out.println("Person(String n)");
	    name = n;
	}
	
	//생성자 
	public Person(String n, int a, String p) {
		System.out.println("Person(String n, int age, String p)");
	    name = n;
	    age = a;
	    phone = p;
	}
	
	void setName(String n) { //set 멤버 변수값 저장
		name = n;            //외부 객체에 입력된 "콩물이"를 저장해줌
	}
	
	void setAge(int a) {
		age = a;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	private void run() { //private 넣고 run();을 입력하면 강제 출력이 됨.
		System.out.println(name + " 달리다!");
	}
	
	void sleep() {
		System.out.println(name + " 자다!");
	}
	
	void eat() {
		run();
		System.out.println(name + " 먹다!");
	}
	
}
