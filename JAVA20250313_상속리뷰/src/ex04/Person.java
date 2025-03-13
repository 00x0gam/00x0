package ex04;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	Person(){} // (하위에 입력했으니 상위도)디폴트 생성자 입력하기 !
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void sleep() {
		System.out.println("잔다...");
	}
	void eat() {
		System.out.println("먹는다...");
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	} // 자바에 기본값으로 있는 toString, 재정의 했던 값을 꼭 확인할 것

	void introduce() {
		System.out.println("안녕하세요. 제 이름은 " + name + "이고, 나이는 " + age + "입니다.");
	}

}
