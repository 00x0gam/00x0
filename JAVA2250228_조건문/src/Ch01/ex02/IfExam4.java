package Ch01.ex02;

import java.util.Scanner;

public class IfExam4 {

	public static void main(String[] args) {
		
		/*
		 * 학점(grade)
		 * 90: a
		 */

        
		int grade = 59;
		
		
		if(grade >= 90) {
			System.out.println("A");
		}else {
			if(grade >= 80) {
				System.out.println("B");
			}else {
				if(grade >= 70) {
					System.out.println("C");
				}else { 
					if(grade >= 60) {
						System.out.println("D");
						}else {
							System.out.println("F");
							
					  }
				    }
				  } 
				}
		
		System.out.println("종료");
					
			}
			
		}
		
		
		
		
		
		
	


