package ch04.ex01;

import java.util.Scanner;

public class WhileExam03 {

	public static void main(String[] args) {

		/*Scanner sc = new Scanner(System.in);
		int sum = 0; // 입력하는 숫자가 키보드라서 sum 값을 먼저 지정
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
	
		//앞에 sum 값을 지정했고 숫자는 키보드라 바로 for 문으로 넘어간다.
		for(int i=1; i<= num ; i++) {
			if(i%2 == 1) // if(조건) 홀수 누적 값만 더해서 나온 값
			sum = sum + i;
		}
		System.out.println(sum);
		*/
		
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("숫자를 입력하세요: ");
		int number = sc.nextInt();
		int i = 1;
		
		while(i<=number) {
			if(i%2 == 1) // 1부터 number까지 홀수합만 누적
				sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
