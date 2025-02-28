package Ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제3 {

	public static void main(String[] args) {

		/*
		 * 국어점수
		 * 80이상이면 상
		 * 60이상 중
		 * 59이하면 하
		 */
		
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("국어 점수: ");
		  int score = sc.nextInt();  
		  
	
		  String result = ((score >= 80) ? "상" : (score >= 60) ? "중" : "하");
		  System.out.println(result);
		 
		 
		
	}

}
