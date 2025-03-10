package ch01.ex01;

public class CarMain {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.displayInfo();
		System.out.println();
		//아무 값도 넣지 않을 거면 지우는 편이...
		//또는 객체 내부에 기본값 입력해주기.
		
		Car car2 =  new Car("기아", "k8", "흰색", 200);
		car2.displayInfo();
		System.out.println();
		
		Car car3 =  new Car("현대", "소나타");
		car3.setColor("흰색"); //색 바꾸기
		System.out.println(car3.getCompany()); //기업 명만
		car3.displayInfo();
		System.out.println();
	
	}

}
