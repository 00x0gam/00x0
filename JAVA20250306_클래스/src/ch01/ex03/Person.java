package ch01.ex03;
             //클래스 명 => 첫 글자 대문자
public class Person {
	
	//필드, 인스턴스 변수
	String name;
	String phone;
	
	int age;
	
	//생성자
	/*=> 값 초기화
	 * 
	 */
	//앞 Person per1 = new Person();가 클래스에서 생성자를 찾는다
	//근데 없어?! 똑똑한 java가 디폴트 생성자를 만든다 ㄷㄷ ai가 지배해
	//그러나, 내가 생성자를 만든다면? java 일 안해... 있는 거 써...
	
	//디폴드 생성자
	public Person() {
		System.out.println("void Person()");
	}
	
	//메소드, 인스턴스 메소드
	void 나이출력(int age) {
		System.out.println("나이: " + age);
		
		
	}
	void 전화번호출력(String phone) {
		System.out.println("전화번호: " + phone);
		
		
	}
	void 이름출력(String name) {
		System.out.println("이름은: " + name);
	}

}
