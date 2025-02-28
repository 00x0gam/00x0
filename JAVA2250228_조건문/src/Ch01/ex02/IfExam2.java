package Ch01.ex02;

import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {
		
		
		/*
		 * 조건문
		 * 1. If (참만 가능)
		 * 2. If ~ else (조건 만족)
		 * 3. If ~ else if ~ else (경우의 수가 많을 때)
		 * 
		 * 3번을 직관적으로 보기 위해 만든게
		 * Switch 문
		 */

        
		int score = 60;  //정수값
		int eng = 80;
		
		
		if(score >=70) {
			System.out.println("합격입니다.");
	
		}else {
			
			System.out.println("불합격");
		} //else 조건에 만족한 값을 도출한다.
		
		
		if(eng >= 70) {
			
			System.out.println("합격입니다.");
		} // eng의 값은 70이상 참이기 때문에 뜬다.
		
		
		System.out.println("종료");
		
		
	}

}
