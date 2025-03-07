package ch06.sec07.exam강사님풀이.copy;

public class CarExamplejava {

	public static void main(String[] args) {

		Car car1 = new Car();
		
		System.out.println();
		
		Car car2 = new Car("자가용");

		
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		
		System.out.println();
		
		Car car4 = new Car("자가용", "빨강", 200);

	}

}

//Car car1 = new Car();
//
////System.out.println(car1.getCompany());
//
//System.out.println();
//
//Car car2 = new Car("자가용");
////System.out.println(car2.getCompany());
////System.out.println(car2.getModel());
////System.out.println(car2.company);
////System.out.println(car2.model);
//
//System.out.println();
//
//Car car3 = new Car("자가용", "빨강");
////System.out.println(car3.getCompany());
////System.out.println(car3.getModel());
////System.out.println(car3.getColor());
//
//System.out.println();
//
//Car car4 = new Car("자가용", "빨강", 200);
////System.out.println(car4.getCompany());
////System.out.println(car4.getModel());
////System.out.println(car4.getColor());
////System.out.println(car4.getMaxSpeed());