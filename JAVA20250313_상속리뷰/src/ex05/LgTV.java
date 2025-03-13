package ex05;

public class LgTV extends TV {
	
	@Override
    void powerOn() {
		System.out.println("LgTV");
		System.out.println("전원 on");
		
	}
	
	void powerOff() {
		System.out.println("LgTV");
		System.out.println("전원 off");
		
	}
	
	void volumeUp() {
		System.out.println("LgTV");
		System.out.println("전원 up");
		
	}
	
	void volumedown() {
		System.out.println("LgTV");
		System.out.println("전원 down");
		
	}
}
