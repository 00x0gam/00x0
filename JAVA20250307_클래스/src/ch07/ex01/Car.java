package ch07.ex01;

public class Car {
	
	private String brand;
	private String model;
	private String year;
	
	Car(String brand, String model, String year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		
		//this 자기 자신, 생성자 호출
	}
	
	void startEngine() {
//		System.out.println("["+ brand +"]["+model+"]의 엔진이 시작되었습니다");
	System.out.printf("[%s] [%s]의 엔진이 시작되었습니다!\n", brand, model);
	}
	
	void displayInfo() {
		System.out.println("["+year+"]년식 ["+ brand +"] ["+model+"]");
	}
}