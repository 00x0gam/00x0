package ch04.ex01;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {
		
		/*
		 * 키보드 숫자 입력 받는다.
		 * 5  --> 1~5 누적합 15
		 * 10 --> 1~10 누적합 55
		 * 100 --> 1~100 누적합 5050
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum = 0; // 입력하는 숫자가 키보드라서 sum 값을 먼저 지정
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
	
		//앞에 sum 값을 지정했고 숫자는 키보드라 바로 for 문으로 넘어간다.
		for(int i=1; i<= num ; i++) {
			if(i%2 == 1) // if(조건) 홀수 누적 값만 더해서 나온 값
			sum = sum + i;
		}
		System.out.println(sum);
		
		sum = 0;
		
			for(int i=1; i<= num ; i=i+2) { // i=1+2 => 2씩 증가하라(짝수끼리 더해라)
					sum = sum + i;
		}
		
		System.out.println(sum);
	  
		
		

	}

}
