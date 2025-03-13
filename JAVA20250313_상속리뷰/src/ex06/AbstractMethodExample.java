package ex06;

public class AbstractMethodExample {
	public static void main(String[] args) {

		//Animal은 추상 클래스라 생성자 선언 불가
		
		Dog dog = new Dog();
		dog.sound(); // 멍멍
		
		Cat cat = new Cat();
		cat.sound(); // 야옹
		
		Flog flog = new Flog();
		flog.sound(); // 개굴
		
		System.out.println();
		
		//다형성
		animalSound(new Dog()); 
		animalSound(new Cat());
		animalSound(new Flog());
		/*
		 * Aaimal는 추상이므로 언급은 따로 없고
		 * 사용된 메소드 선언과 하위 메소드 매개 변수 불러오면 되는 듯?
		 */
	}
	                            // 각 Dog, Cat, Flog가 animal로 자동 타입 변환이 된 상태
	public static void animalSound(Animal animal) {
		animal.sound(); // 재정의된 메소드 호출
	}

}
