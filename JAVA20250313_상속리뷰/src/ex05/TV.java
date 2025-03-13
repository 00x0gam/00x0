package ex05;
/*
 * 클래스 내부에 추상 클래스가 1개 이상
 * 존재하면 그 클래스는 추상 클래스이다.
 */
public  abstract class TV {
	boolean power;
	int volume;
	String person;
	
	TV(){
		power = false;
		volume = 0;
	}
	// 추상 메소드 => 바디가 없다 { }
	abstract void powerOn();
	
	abstract void powerOff();
	
	abstract void volumeUp();
	
	abstract void volumedown();
	
	void test() {
		//추상 안에 일반 메소드가 있어도 ㄱㅊ긴함.
	}
}
