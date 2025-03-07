package ch08.ex01;

public class Member {
	
	private String name;
	private String id;
	private String password;
	private int age;
	
	
	Member(){}
	
	
	Member(String name, String id){
		this.name = name;
		this.id = id;

	}
	
	
	Member(String name, String id, String password, int age){
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
		
	}
	
	void displayInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(password);
		System.out.println(age);
		
		
		
	}
}
