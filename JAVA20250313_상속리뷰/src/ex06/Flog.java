package ex06;

public class Flog extends Animal { // Animal 상속 받기
	
	@Override // 재정의
	public void sound() { // 소리 낸다 : 개굴
		System.out.println("개굴");
	}

}
