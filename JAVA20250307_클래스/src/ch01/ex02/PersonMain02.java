package ch01.ex02;
             
public class PersonMain02 {

	public static void main(String[] args) {
		/*
		 * 이름, 나이, 전화번호만 입력
		 */
		
		Person per1 = new Person();
		
		per1.age = 25;
		per1.phone = "010-1234-5678";
		per1.name = "이은지";
		// per1 지정해서 정보값 입력하기
		
		per1.이름출력(per1.name);
		per1.나이출력(per1.age);
		per1.전화번호출력(per1.phone);
		//정보값 입력한 내용 언급하며 메소드 호출하기
	}

}
