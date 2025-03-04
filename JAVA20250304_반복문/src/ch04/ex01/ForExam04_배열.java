package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열 {

	public static void main(String[] args) {
		
		/*
		 * 5명 점수를 입력 받아서, 총점 평균을 구하기
		 */
		
		Scanner sc = new Scanner(System.in); //키보드 입력
		
		System.out.println("1번 학생 자바 점수>> "); // 1번 학생 점수 입력하면 numA로 저장
		int numA = sc.nextInt();
		
		System.out.println("2번 학생 자바 점수>> "); // 2번 학생 점수 입력하면 numB로 저장
		int numB = sc.nextInt();
		
		System.out.println("3번 학생 자바 점수>> "); // 3번 학생 점수 입력하면 numC로 저장
		int numC = sc.nextInt();
		
		System.out.println("4번 학생 자바 점수>> "); // 4번 학생 점수 입력하면 numD로 저장
		int numD = sc.nextInt();
		
		System.out.println("5번 학생 자바 점수>> "); // 5번 학생 점수 입력하면 numE로 저장
		int numE = sc.nextInt();
		
		int sum = numA + numB + numC + numD + numE; // 모든 점수를 더한 값 = sum
		
		double average = sum/5.0; // 평균 계산 => 총점(sum) / 5.0 (실수라서 dounle 입력)
		System.out.printf("총점 : %d, 평균: %.2f\n", sum, average);
		// 총점: 정수 %d, 평균: 실수 %.2f(소수점 두 자리수까지)\n 나열
		
		

	}

}
