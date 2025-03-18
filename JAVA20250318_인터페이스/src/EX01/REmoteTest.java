package EX01;


public class REmoteTest {

	public static void main(String[] args) {

//		RemoteControl remote = new Telvision(); => Telvision 호출
//		RemoteControl remote2 = new Radio(); => Radio 호출
		
		//인터페이스는 걍 찾아봐줄게 카운터?... 
		
		RemoteControl remote;
		remote = new Telvision(); //이런 방식도 됨
		
		remote.turnOn();
		remote.setVolume(5);
		remote.turnOff();
		System.out.println();
		
		RemoteControl remote2 = new Radio();
		
		remote2.turnOn();
		remote2.setVolume(5);
		remote2.turnOff();
		
//		System.out.println("볼륨 최대: " + RemoteControl.MAX_VOLUME);
//		System.out.println("볼륨 최저: " + RemoteControl.MIN_VOLUME);
	}

}
