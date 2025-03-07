package ch02.ex02;

public class MainStudent {

	public static void main(String[] args) {

		/*
		 * 1. Student 객체생성하면서 이름(홍길동), 학년(3), 나이(20) 입력
		 * 2. printInfo() 메소드 호출
		 * 3. 이름을 이순신으로 변경
		 * 4. 변경된 이름만 출력
		 * 5. 학년 5로 변경
		 * 6. 변경된 학년만 출력
		 * 
		 */
		
		Student student = new Student("홍길동", 3, 20);
		
		student.printInfo(); //호출하는 방법을 몰랐구먼...
		
		student.setName("이순신");
		
		String name = student.getName(); //다시 입력한 set값과 반환된 get값 호출
		System.out.println(name);
		
		student.setGrade(5);
		
		int grade = student.getGrade(); //다시 입력한 set값과 반환된 get값 호출
		System.out.println(grade);
		
		//ㄴㅇㅅ
	}

}
