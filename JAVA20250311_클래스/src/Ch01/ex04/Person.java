package Ch01.ex04;
/*
 * setter, getter
 */

public class Person {

	private String name;
	private int age;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setage(int age) {
		this.age = age;
	}
	
	int getAge() {
		return age;
	}
	
	//생성자
	Person(){
		this("콩물이", 1);
	}
	
	Person(String name){
		this(name, 1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}	
	String displayInfo() {
		return name + " : " + age;
	}
    
	
	void sleep() {
		System.out.println("자고 싶다....");
		
	}
	
	void eat() {
		System.out.println("배고프다....");
		
	}
	
}
