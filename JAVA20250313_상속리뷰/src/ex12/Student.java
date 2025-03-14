package ex12;

public class Student extends Human {
	private String number;
	private String major;
	
	
	public Student(){}
	public Student(String name, int age, int height, int weight, String number, String major){
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return getprintInformation() + " " + number + " " + major;
	}
	
	
//	public String getNumber() {
//		return number;
//	}
//	public String getMajor() {
//		return major;
//	}
	
}
