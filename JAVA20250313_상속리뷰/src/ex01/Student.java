package ex01;

public class Student extends Person{
	private String schoolName;
	private int grade; //학년
	
	void study() {}
	
	void introduce() {
		System.out.println("안녕하세요. 저는 " + schoolName + "에 다니고, 올해 "+ grade + "학년으로 올라간" + getName() + " 입니다.");
	}
	
}
