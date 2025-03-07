package ch01.ex04;
             
public class PersonMain02 {

	public static void main(String[] args) {
		/*
		 * 이름, 나이, 전화번호만 입력
		 */
		
		Person per1
		= new Person("이은지", 25, "010-1234-5678");
		
//		per1.age = 20;
		
		per1.이름출력();
		per1.나이출력();
		per1.전화번호출력();
		//정보값 입력한 내용 언급하며 메소드 호출하기
		
		 System.out.println("--------------------");
		
		Person p2
		= new Person("안준휘", 25, "010-0000-0000");
		
		p2.이름출력();
		p2.나이출력();
		p2.전화번호출력();
	}

}
