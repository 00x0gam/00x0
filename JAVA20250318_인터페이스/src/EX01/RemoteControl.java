package EX01;

public interface RemoteControl {
	/*
	 * main과 구현 객체 사이의 너... interface
	 * 오작교인가봄 ㅋ
	 */

	public void turnOn(); //생성자 못 만듬
	
//	public static final 인터페이스에서는 그냥 이게 지정값이기 때문에 생략 가능
	int MAX_VOLUME = 10; // => 상수 선언
	int MIN_VOLUME = 0; // => 상수 선언
	
	/*
	 * interface 상수
	 * 멤버변수 생성 불가 , 생성자 생성 안됨 => 무조건 객체 생성하기
	 * 정적변수만 생성 가능 => static final
	 */
	
	// 메소드 선언문만 작성
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드
	//=> 하위 클래스에게 재정의하고 싶으면 하고 싫으면 말아
	default void 신기능() {
		
		/*=> 신기능을 추가하고 싶은데
		그러면 다른 하위 클래스가 죽어버린다.
		그럼 어떻게 해결해야 할까?
		
		void 옆에 default를 붙여줘야 한다.
		*/
		
	}
	
}
