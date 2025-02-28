package Ch01.ex02;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {

		/*
		 * 학점(grade)
		 * 90: A
		 * 80: B
		 * 70: C
		 * 60: D
		 * 그 이하: F
		 */

        
		int grade = 85;
		
		//점수를 10으로 나눴을 때,
		//앞자리 숫자에 알맞는 것에 등급을 부여함 96 / 10 = 9.6 (A)
	
		switch(grade/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;	
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
		    break;
		default:
			System.out.println("F");
		}
		
		
		System.out.println("종료");
					
			}
			
		}
		
		

