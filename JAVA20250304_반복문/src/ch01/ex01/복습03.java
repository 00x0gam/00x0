package ch01.ex01;

import java.util.Scanner;

public class 복습03 {

	public static void main(String[] args) {

		/*
		 * 기본 자료형(byte, short, char, int, long/ float, double/ boolean)
		 * 
		 * 8개를 제외한 나머지
		 */
		
		// 객체 참조 변수
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력>> ");
		int num = sc.nextInt();
		
		// 삼항 연산자
		// (조건 판단) ? 참 : 거짓;
		// (조건1) ? 참 : (조건2) ? 참 : 거짓;
		String msg = ((num > 0) ? "양수" : (num == 0) ? "0" : "음수") ;
		System.out.println(msg);
		
		// 여기서 0 입력하면 0, (num == 0) ? "0" 조건을 추가해서
		
		
	}

}
