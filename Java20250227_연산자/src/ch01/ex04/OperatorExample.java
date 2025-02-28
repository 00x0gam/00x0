package ch01.ex04;

public class OperatorExample {

	public static void main(String[] args) {

		int a = 5;
		int b = 2;
		
		/*
		 * 정수 연산 정수 >> 정수 예) 5/2 = 2, 나머지 1은 버림
		 * 정수 연산 실수 >> 실수 예) 5/2.0 = 2.5
		 * 실수 연산 실수 >> 실수 예) 5.0/2.0 = 2.5
		 * 정수 연산 문자열 >> 문자열 예) 10 + "ab" => "10ab"
		 * 실수 연산 문자열 >> 문자열 예) 10.2 + "10" => "10.210"
		 * 문자열 연산 문자열 >> 문자열 예) "10.2" + "20" => "10.220"
		 * 문자열 연산 문자열 >> 문자열 예) "ab" + "cd" => "abcd"
		 */
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		// 정수/정수는 정수값 출력, 소수점 이하는 버린다.
		// 나머지 연산자, 나머지값을 출력
		
		
	}

}
