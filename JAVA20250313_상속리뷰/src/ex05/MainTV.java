package ex05;

public class MainTV {

	public static void main(String[] args) {

//		TV tv = new TV();
//		실행이 되지 않는다. 뼈만 있고 살이 없어서...
//      추상을 제외한 실체는 생성자해도 ㄱㅊ다.		
		TV tv1 = new SamsungTV();
		tv1.powerOn();
		tv1.powerOff();
		
		tv1.volumeUp();
		tv1.volumedown();
		
		TV tv2 = new LgTV();
		tv2.powerOn();
		tv2.powerOff();
		
		tv2.volumeUp();
		tv2.volumedown();
	
	}

}
