package Ch01.ex02;

public class Phone { //상위 클래스
	//필드 선언
	public String model;
	public String color;
	
	//메소드 선언
	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	public void sendVoice(String message) {
		System.out.println("나: " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("엄마: " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
