package ch01.ex03;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
	
//		myCar.run();
		
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
		/*
		 * tire 필드 선언 - Car 객체 생성
		 * tire에 roll() 정의
		 * 
		 * Hankook, Kumho 입력 - tire에 자동 변환 가능(상속)
		 * + 재정의 된 상태
		 * 
		 * Car 클래스에 있는 run();는
		 * tire 필드에 대입된 객체 roll() 메소드 호출
		 * 
		 * myCar.tire = new HankookTire();
		 * myCar.run();
		 *
		 *  myCar.tire = new KumhoTire();
		 * myCar.run();
		 *  
		 * 각각 재정의 된 roll() 호출이 됨.
		 * 
		 * 자동 타입 변환 + 메소드 오버라이딩 = 다형성
		 */
	}

}
