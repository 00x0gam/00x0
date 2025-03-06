package ch01.ex01;

/*
 * 함수
 * 입력(매개변수)     출력(반환값)
 * 0               0 => 03
 * 0               X => 02
 * X               0 => 04
 * X               X => 01
 * 
 * 함수 정의 => 함수 만드는 것
 * 함수 호출 => 만든 함수를 실행하는 것
 */
		
public class 함수매개변수없고반환값없는경우 {

	public static void main(String[] args) { // 이게 없으면 함수 호출 못함
		//입력값도 없음...
		sum(); // 1번 함수 호출
		System.out.println("프로그램 종료!!!"); // 3번
	}
	// 함수 정의
	public static void sum() { //반환값 전달이 없음...
		
		// 코드 구현
		System.out.println("void sum() 함수 호출!!!");
		//2번 앞에 sum;이 함수를 호출함(점프)


	}

}
