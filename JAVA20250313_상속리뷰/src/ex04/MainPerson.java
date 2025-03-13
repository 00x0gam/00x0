package ex04;

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
	// p가 참조하고 있는 대상은 Person 객체 이거나 Person상속한 객체
	static void method(Person p) { 
		
		// p가 참조하고 있는 객체가 UniversityStudent니?
		if(p instanceof UniversityStudent) {
			UniversityStudent u = (UniversityStudent)p;
			u.sleep();
			u.study();
			u.registerCourse();
		// p가 참조하고 있는 객체가 Student
		}else if(p instanceof Student) {
			Student s = (Student)p;
			s.sleep();
			s.study();
		}else {
			p.sleep();
		}
		System.out.println("---------------------------");
	}

}
