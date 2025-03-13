package ex06;

public class Cat extends Animal{ // Animal 상속 받기
	
	@Override // 재정의
	public void sound() { // 소리 낸다 : 야옹
		System.out.println("야옹");
	}

}
