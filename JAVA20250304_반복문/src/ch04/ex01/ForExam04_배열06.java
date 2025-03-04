package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열06 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) { //세로
			for(int j=0; j<5; j++) { //가로
			System.out.print("* ");
			
			}
			System.out.println();
		}
		// 중괄호 잘 닫기... 이것 땜에 오류나...
		System.out.println();
		System.out.println();
		
		for(int i=0; i<5; i++) { //세로
			for(int j=0; j<i+1; j++) { //가로
				System.out.printf("* ");
			}	
			System.out.println();
		
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0; i<5; i++) { //세로
			for(int j=0; j<5-i; j++) { //가로
				System.out.printf("* ");
			}	
			System.out.println();
		}
	}
		
}


