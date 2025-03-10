package Ch01.ex02;

public class SmartPhoneExample {

	public static void main(String[] args) {
        //SmartPhone 객체 생성
		SmartPhone myPhone= new SmartPhone("갤럭시", "은색");
		
		//Phone 상속받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
		System.out.println();
		
		//SmartPhone 필드 읽기
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
		System.out.println();
		
		//Phone 상속받은 메소드 호출
		myPhone.bell();

		myPhone.sendVoice("여보세요?");
		myPhone.receiveVoice("응, 엄마야. 전화 받을 수 있어?");
		myPhone.sendVoice("아니, 지금 수업중이야.");
		
		myPhone.hangUp();
		
		System.out.println();
		
		//SmartPhone 메소드 호출
		myPhone.serWifi(true);
		myPhone.internet();
		
	}

}
