package mobile;

public class Ltab extends Mobile{
	
	public Ltab(){}
	
	public Ltab(String mobile, int batterySize, String osType){
		super(mobile, batterySize, osType);

	}
	
	@Override
	public void operate(int time) {
		//사용을 통해 배터리 감소 구현
		//1분 사용 시 배터리 10감소
		int size = getBatterySize(); // 500 들어가 있음
		size += time*-10; //size = 500 + -100
		setBatterySize(size);
	}

	@Override
	public void charge(int time) {
		//충전을 통한 배터리 증가 구현 
		//1분 충전 시 배터리 10증가
		int size = getBatterySize();
		size += time*10;
		setBatterySize(size);
	}

}
