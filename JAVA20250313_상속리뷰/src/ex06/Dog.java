package ex06;

public class Dog extends Animal{ // Animal 상속 받기
	
	@Override // 재정의
	public void sound() { // 소리 낸다 : 멍멍
		System.out.println("멍멍");
	}

}
