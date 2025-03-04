package ch01.ex01;

import java.util.Scanner;

public class 복습04 {

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
		// 더 쉽게 보는 법 if 문
		
		String msg = "";
		if (num >  0) {
			msg = "양수";
		}else {
			msg = "음수";
		}
		// if else 문장이 한 줄일 때 중괄호가 꼭 필수는 아니다.
		// 하지만 난 넣을 것이다.
		System.out.println(msg);
		
		
		
	}

}
