package ch01.ex03;

public class Car {
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	private static int count; // 정적 변수

	static String companyState = "GM"; // 정적 변수
	static void stateFunc() {}
	
	public static void runState() { // 정적 메소드
		//정적 메소드 안에서 사용할 수 있는 변수 및 메소드는
		//static이 붙어있는 정적메소드는 정적 변수만 사용가능
			System.out.println("Static Run()");
			count++;
			companyState = "기아";
			stateFunc();
//			company = "현대";
//			run(); => 메모리 접근부터 안된다.
			
		}
		
	public Car() {
		//this(), super() => 함수 맨 앞 와야함.
		this("현대", "그랜저", "검정", 250);
		System.out.println(++Car.count);
	}
	
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company; //this 필수 => 여기에 값 넣을게
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void displayInfo() {
		System.out.println("기업: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("속도: " + maxSpeed);
	}
}


