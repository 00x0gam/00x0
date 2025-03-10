package ch01.ex01;

public class Car {

	private String company;
	private String model;
	private String color;
	private int maxSpeed;

	public Car() { //기본 생성자
//	this.company = "현대";
//	this.model = "그랜저";
//	this.color = "검정";
//	this.maxSpeed = 250;
		this("현대", "그랜저", "검정", 250);
	}
	
	public Car(String company, String model) { //받아줄 객체 생성자 알아서 정하기
//		this.company = company;
//		this.model = model;
//		this.color = "검정";
//		this.maxSpeed = 250;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
