package EX01;

public class Radio implements RemoteControl {
	//라디오 객체 생성  - implements 인터페이스 상속 키워드 
	// 인터페이스 추상 상속 무조건 전부!!! 받기
	
	private int volume;
	//인터페이스에 추가된 setVolume의 변수값을 객체에서 추가해준다
	// => 그래야 24줄에 오류 안 생김
	
	@Override //추상 메소드 재정의 
	public void turnOn() {
		System.out.println("라디오를 켭니다.");
	}
	
	@Override
	public void turnOff(){
		System.out.println("라디오를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨: " + this.volume);
	}

}
