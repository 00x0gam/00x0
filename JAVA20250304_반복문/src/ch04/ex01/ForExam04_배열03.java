package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열03 {

	public static void main(String[] args) {
		
		/*
		 * 5명 점수를 입력 받아서, 총점 평균을 구하기
		 */
		
		Scanner sc = new Scanner(System.in); //키보드 입력
		
		int[] num = new int[5]; // 배열 선언: int 공간 5개를 준비하라!
		int sum = 0; // sum 0 대입
		
	    for(int i=0; i<5; i++) { // 초기값 0, 5번 반복, 1씩 증감하기
	    	System.out.println(i+1 + "번 학생 자바점수>>");
	    	//0+1=1번 학생 자바점수(여기서 i는 계속 증감)
	    	
	    	num[i] = sc.nextInt(); // 번호 증감하면서 입력되는 키보드 점수 입력 저장
	    	sum += num[i]; // 지금까지 배열에 입력된 누적 점수

	    }
		
		
		double average = sum/5.0; // 평균 계산 => 총점(sum) / 5.0 (실수라서 dounle 입력)
		System.out.printf("총점 : %d, 평균: %.2f\n", sum, average);
		// 총점: 정수 %d, 평균: 실수 %.2f(소수점 두 자리수까지)\n 나열
		
		
	}

}
