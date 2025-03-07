package ch06.sec07.exam04;

public class Car {
	
	private String company = "현대자동차";
	private String model = "자가용";
	private String color = "빨강";
	private int maxSpeed = 200;
	
	
	String getCompany(){
		return company;
	}

	String getModel(){
		return model;
	}
	
	String getColor(){
		return color;
	}
	
	int getMaxSpeed(){
		return maxSpeed;
	}
	
	Car(){
		System.out.println("car1.company : "+ company);
	}
	
	Car(String model){
		this.model =  model;
		System.out.println("car2.company : "+ company);
		System.out.println("car2.model : "+ model);
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
		
		System.out.println("car3.company : "+ company);
		System.out.println("car3.model : "+ model);
		System.out.println("car3.color : "+ color);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed =  maxSpeed;
		
		System.out.println("car4.company : "+ company);
		System.out.println("car4.model : "+ model);
		System.out.println("car4.color : "+ color);
		System.out.println("car4.maxSpeed : "+ maxSpeed);
	}
}
