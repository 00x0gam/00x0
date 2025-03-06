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
		
public class 함수매개변수있고반환값없는경우02 {

	public static void main(String[] args) { // 이게 없으면 함수 호출 못함
		//입력값도 생김!!!
		sum(10, 20); // 1번 함수 호출
		System.out.println("프로그램 종료!!!"); // 3번
	}
	// 함수 정의
	public static void sum(int n1, int n2) { 
		//int num 은  int num = 100; (매개변수)
		//앞 sum에 100을 넣었는데 여기도 값을 안 넣으면 오류가 생긴다.
		//int num으로 입력값은 있음 근데 반환값 전달이 없음...
		
		//앞 sum에 실수를 입력할 거면 아래 sum에 int num이 아닌 double로 변경하기_기본이쥬?
		//앞 sum이 (10, 20)이면 아래 sum도 (int num, int num)으로 변경
		//매개변수 갯수는 서로 꼭!!! 맞아야 한다
		//boolean flag를 넣고 싶으면 앞 sum은 true, felse
		//타입도 알아야 하고 매개변수도 맞아야 하고(자바 기본 타입을 꼭 알아두면 좋겠지요?
		
		// 코드 구현
		System.out.println("void sum(int n1, int n2) 함수 호출!!!"); //2번 앞에 sum;이 함수를 호출함(점프)
		System.out.println(n1+n2);


	}

}
