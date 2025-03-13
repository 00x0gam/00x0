package ex06;

public abstract class Animal { //추상 클래스 선언
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();
	//추상 선언을 넣어서 바디를 지운다.
	//소리 낸다: 구체적인 소리는 아직 모름
	//뼈가 되는 부분
}
