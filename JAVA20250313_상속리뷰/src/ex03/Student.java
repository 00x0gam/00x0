package ex03;

public class Student extends Person{
	private String schoolName;
	private int grade; //학년
	
	Student(){} // (하위에 입력했으니 상위도)디폴트 생성자 입력하기 !
	
	Student(String name, int age, String schoolName, int grade){
		super(name, age);
		this.schoolName = schoolName;
		this.grade = grade;
	}
	
	void study() {
		System.out.println("공부한다...");
	}
	
//	@Override
//	public String toString() {
//		return schoolName + " , " + grade + "입니다";
//	} 각자 가지고 있는 매개변수로 재정의해서 띄어준다.
	
	@Override
	void introduce() {
		System.out.println
		("안녕하세요. 제 이름은 " + schoolName + "에 다니고, 올해 "+
		grade + "학년으로 올라간 " + getName() + "입니다.");
	}
	
}
