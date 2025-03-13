package ex03;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Student s1 =  new Student();
		UniversityStudent u1 = new  UniversityStudent();
		
		method(p1);
		method(s1);
		method(u1);
		
	}
	//객체 타입 변환
	static void method(Person p) { 
		if(p instanceof UniversityStudent) {
			((UniversityStudent)p).sleep(); //체인기법으로 묶기
			((UniversityStudent)p).study();
			((UniversityStudent)p).registerCourse();
		}else if(p instanceof Student) {
			((Student)p).sleep();
			((Student)p).study(); 
		}else {
			p.sleep();
		}
		
		System.out.println("---------------------------");
	}

}
