package ch02.ex02;

public class Student {
	
	private String name;
	private int grade; // 학년
	private int age;
	
//	 public Student() {
//			System.out.println("Student()");
//			}
			
     public Student(String n, int g, int a) { //맞게 함
//				System.out.println("Student(String n, int g, int a)");
				name = n;
				grade = g;
				age = a;
			}
     
     void setName(String n) { //맞게 함
 		name = n;          
 	}
     void setGrade(int g) { //맞게 함
    	 grade = g;
 	}
 	
 	String getName() { //맞게 함
 		return name;
 	}
 	
 	int getGrade() { //맞게 함
 		return grade;
 	}
	
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("나이 : " + age);
		
		
	   
	}

}
