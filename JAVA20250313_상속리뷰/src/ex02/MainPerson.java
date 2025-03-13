package ex02;

public class MainPerson {

	public static void main(String[] args) {

		UniversityStudent u1 = new UniversityStudent("이은지", 22, "한성대", 2, "디자인");
		u1.introduce();
		
		Person p1 = new Person("안준휘", 25);
		p1.introduce();
		
		Student s1 = new Student("전수경", 24, "경북대", 4);
		s1.introduce();
		
		System.out.println("-------------------------");
		
		s1.eat();
		u1.sleep();
		
		System.out.println("-------------------------");
		
		System.out.println(p1); //@ 뒤 메모리 주소
		System.out.println(s1);
		System.out.println(u1);
		
		System.out.println("-------상위 클래스는 하위 클래스 참조 가능------------");
		
		Person p2 = new Student();
		Student s2 = new UniversityStudent();
		
		System.out.println("-------하위 클래스는 상위 클래스 참조 불가능-----------");
		
//		Student s3 = new Person();
		// 왜? 내가 가지고 있는데 다른 변수는 다른 메소드에 있자나...
		// 뭘 써먹어... 쓸 수 있는 게 1도 없으니깐 뭐... 바이여...

		System.out.println("-------하위 클래스는 상위 클래스 참조 불가능------------");
		
		Person p3 = new Student();
		Student s3 = (Student)p3; //가능
		//오 다른 곳 가도 내꺼 쓸 수도 있네 ㅋㅋ
		
		p3 = new Person();
		
//		p3 = new Person();
//		s3 = (Student)p3; //불가
		
		System.out.println("-------다향성 ==> 자동 변환 + 오버라이딩------------");
		
		Person p5 = new Person();
		p5.sleep();
		p5.introduce();
		System.out.println(p5); //재정의 값 확인, 아무 것도 입력을 하지 않았으므로 null, 0
		
		p5 = new Student();
		p5.sleep();
		p5.introduce();
		System.out.println(p5);
		
		p5 =  new UniversityStudent();
		p5.eat();
		p5.introduce();
		System.out.println(p5);
		
		
	}

}
