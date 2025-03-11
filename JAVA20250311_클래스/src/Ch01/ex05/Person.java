package Ch01.ex05;
/*
 * static(정적) <===> 인스턴스
 * 인스턴스 변수(멤버 변수), 인스턴스 메소드(멤버 메소스)
 * 정석 변수, 정적 메소드
 */

public class Person {

	private String name;
	private int age;
//	private int count;
	
	static int count; //정적 변수 => 공유 자원
	static void f1() {}
	
	static void func() { //정적 메소드 => 공유 자원
		System.out.println("정적 메소드 func()");
		count++;
		f1();
//		age++; => static 붙인 것만 쓸 수 있음
//		eat(); => static 붙인 것만 쓸 수 있음
		
	}
	
	
	//생성자
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}	
	
	String displayInfo() {
		return name + " : " + age;
	}
    
	
	void sleep() {
		count++;
		func();
		eat(); //얘넨 상관없는 듯?
		age++; //얘넨 상관없는 듯?
		System.out.println("자고 싶다....");
		
	}
	
	void eat() {
		System.out.println("배고프다....");
		
	}
	
}
