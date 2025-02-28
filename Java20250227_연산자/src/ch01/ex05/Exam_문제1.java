package ch01.ex05;

import java.util.Scanner;

public class Exam_문제1 {

	public static void main(String[] args) {

		/*
		 * 키보드 통해서 4000을 입력 받은 후
		 * 시 분 초를 구하는 프로그램 구현
		 * 입력: 4000
		 * 출력: 1시간 6분 40초
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		
		int a = 4000;
		int b = 4000;
		int c = 660;
		int d = 100;
		
		
		int h = a / b; // 시간
		int m = a / c; // 분
		int s = a / d; // 초
	
		
		System.out.println("출력: "+ h + "시간 " + m + "분 " + s + "초");
		
		/*
		 * 강사님 풀이
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("입력: ");
		 * String str = sc.nextLine();
		 * 
		 * int x = Integer.parseInt(str);
		 * 
		 * int hour = totalSeconds / 3600;  = 시간
		 * int minutes = (totalSecounds % 3600) / 60;  = 분
		 * int seconds = totalSecounds % 60;
		 * 
		 * System.out.printf
		 * ("total 초 : %d, 시간:%d 분:%d 초:%d\n", totalSeconds, hours, minutes, seconds);
		 *
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
