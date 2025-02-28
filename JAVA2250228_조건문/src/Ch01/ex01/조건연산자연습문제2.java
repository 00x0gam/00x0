package Ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제2 {

	public static void main(String[] args) {

		/*
		 * 키보드 통해서 국어점수, 영어점수 입력 받는다
		 * 국어점수, 영어점수 둘다
		 * 70이상이면 합격 아니면 불합격
		 */
		
		// 이번에는 if 문이 아닌 삼항(조건) 연산자 사용했다!!
        Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int k = sc.nextInt();  //정수값
		
		sc.nextLine();
		
		System.out.print("영어 점수: ");
		int e= sc.nextInt();
		
		String result = (k >= 70) & (e >=70) ? "합격입니다." : "불합격입니다.";
		// 논리 연산자 사용하기
		
		System.out.println(result);
		
		// 성공!!!!!!
		
		/*
		 * 강사님 풀이
		 * 
		 * 나랑 똑같긔
		 * 
		 */
		
	}

}
