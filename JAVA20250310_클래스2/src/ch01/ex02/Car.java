package ch01.ex02;

public class Car {

	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
    //정적 변수
	static String companyState = "GM";
	
	//정적 메소드
	public static void runState() {
		System.out.println("Static Run()");
	}

	public Car() { //기본 생성자
		this("현대", "그랜저", "검정", 250);
	}
	
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company; //this 필수 => 여기에 값 넣을게
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void run() {
		System.out.println(company + " 달린다.");
	}
	
	public void displayInfo() {
		System.out.println("기업: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("속도: " + maxSpeed);
	}
}
