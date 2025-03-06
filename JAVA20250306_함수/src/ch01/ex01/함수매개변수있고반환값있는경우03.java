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
		
public class 함수매개변수있고반환값있는경우03 {

	public static void main(String[] args) { // 이게 없으면 함수 호출 못함
		//입력값 생김!!!
		int result = sum(10, 20); // 1번 함수 호출
		//int result = 30; return값이 반환된 모습
		System.out.println(result); // 이 두 라인을 입력해야만 출력이 됨
		System.out.println("프로그램 종료!!!"); // 3번
	}
	// 함수 정의
	public static int sum(int n1, int n2) { 
		//void => int로 변경하기 . return 값과 일치해야한다!!!
		//여기서 int는 return를 정수로 반환하겠다는 말
		//return 값이 비어잇음 오류가 뜬다...
		
		
		// 코드 구현
		System.out.println("void sum(int n1, int n2) 함수 호출!!!");
		//2번 앞에 sum;이 함수를 호출함(점프)
		return n1+n2;
		
		// return 값을 반환한다.(반환값 생성~)
		// (n1 + n2 => 정수값)


	}

}
