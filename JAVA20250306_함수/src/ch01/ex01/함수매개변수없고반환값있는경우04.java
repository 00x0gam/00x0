package ch01.ex01;

/*
 * 함수
 * 입력(매개변수)     출력(반환값)
 * 0               0
 * 0               X
 * X               0
 * X               X
 * 
 * 함수 정의 => 함수 만드는 것
 * 함수 호출 => 만든 함수를 실행하는 것
 */
		
public class 함수매개변수없고반환값있는경우04 {

	public static void main(String[] args) { // 이게 없으면 함수 호출 못함
		double result = sum(); // 1번 함수 호출
		//입력값은 없지만 return을 출력해야해서 있다.
		//타입도 return과 일치하게
		
		System.out.println(result); 
		System.out.println("프로그램 종료!!!"); // 3번
	}
	// 함수 정의
	public static double sum() {
		//입력값이 없어서 매개변수도 없는 상태
		//타입은 return과 일치하게
		
		// 코드 구현
		System.out.println("int sum() 함수 호출!!!");
		double pi = 3.14159;
		//반환값 입력 (실수라서 타입 double)
		return pi;
		
		


	}

}
