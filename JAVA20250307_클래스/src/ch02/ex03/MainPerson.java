package ch02.ex03;

public class MainPerson {

	public static void main(String[] args) {

/*
 * name, age 필드로 가짐
 * 생성자를 통해 name와 age를 설정할 수 있음
 * introduce() 메소드에서
 * "안녕하세요, 제 이름은 (name)이고, (age)살입니다." 문자열 반환
 * 
 * main 메소드에서 Person 객체 생성
 * introduce()호출로 결과 출력
 */

		Person person = new Person("이은지", 25);
		
		String msg = person.introduce();
		System.out.println(msg);
		
	}

}
