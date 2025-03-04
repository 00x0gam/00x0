package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열02 {

	public static void main(String[] args) {
		
		/*
		 * 5명 점수를 입력 받아서, 총점 평균을 구하기
		 */
		
		Scanner sc = new Scanner(System.in); //키보드 입력
		
		int[] num = new int[5]; // 배열 선언: int 공간 5개를 준비하라!
		
		System.out.println("1번 학생 자바 점수>> "); // [0] 공간에 1번 학생 자바 점수 입력하기
		num [0] = sc.nextInt();
		
		System.out.println("2번 학생 자바 점수>> "); // [1] 공간에 1번 학생 자바 점수 입력하기
		num [1] = sc.nextInt();
		
		System.out.println("3번 학생 자바 점수>> "); // [2] 공간에 1번 학생 자바 점수 입력하기
		num [2] = sc.nextInt();
		
		System.out.println("4번 학생 자바 점수>> "); // [3] 공간에 1번 학생 자바 점수 입력하기
		num [3] = sc.nextInt();
		
		System.out.println("5번 학생 자바 점수>> "); // [4] 공간에 1번 학생 자바 점수 입력하기
		num [4] = sc.nextInt();
		
		int sum = num[0] + num[1] + num[2] + num[3] + num[4]; // 모든 공간의 점수를 더한 값 = sum
		
		double average = sum/5.0; // 평균 계산 => 총점(sum) / 5.0 (실수라서 dounle 입력)
		System.out.printf("총점 : %d, 평균: %.2f\n", sum, average);
		// 총점: 정수 %d, 평균: 실수 %.2f(소수점 두 자리수까지)\n 나열
		
		

	}

}
