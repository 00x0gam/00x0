package ch01.ex4;

class CarMain {

	int speed;
	
	void run() {
		speed = 100;
	}
	
	void eat() {
		speed = 100;
	}
	
	public static void main(String[] args) { //=> 넌 외부인이야
		
//		CarMain car = new CarMain();
//		car.speed = 200;
		System.out.println("main2()");

	}
}
