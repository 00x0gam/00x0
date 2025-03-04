package ch01.ex01;

import java.util.Scanner;

public class 복습02 {

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
		String msg = (num > 0) ? "양수" : "음수" ;
		System.out.println(msg);
		
		// 이상태에서 0을 입력하면 음수
		
		
	}

}
