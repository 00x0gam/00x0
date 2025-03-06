package ch01.ex04;
             //클래스 명 => 첫 글자 대문자
public class Person {
	
	//필드, 인스턴스 변수
	private String name;
	private String phone;
	
	private int age;
	//잘못된 입력 외부노출 금지하기
	//변수 옆에 무조건 붙일 것!!
	
	//생성자
	public Person(String n, int a, String p) {
		name = n;
		age = a;
		phone = p;
	}
	
	
	//디폴드 생성자
	public Person() {
		System.out.println("void Person()");
	}
	
	//메소드, 인스턴스 메소드
	void 나이출력() {
		System.out.println("나이: " + age);
		
		
	}
	void 전화번호출력() {
		System.out.println("전화번호: " + phone);
		
		
	}
	void 이름출력() {
		System.out.println("이름은: " + name);
	}

}
