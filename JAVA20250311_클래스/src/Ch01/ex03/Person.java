package Ch01.ex03;
/*
 * 사람 클래스
 * 사람 특징 - name, age, height, weight, ...
 * 사람 동작 - run, sleep, eat, study, work, ...
 * 
 * 간추려 내는 과정을 추상화...
 */
public class Person {

	private String name;
	private int age;
	
	Person(){
//		name = "콩물이";
//		age = 1;
		this("콩물이", 1);
	}
	
	Person(String name){
//		this.name = name;
//		age = 1;
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
