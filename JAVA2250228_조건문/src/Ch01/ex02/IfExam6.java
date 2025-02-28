package Ch01.ex02;

import java.util.Scanner;

public class IfExam6 {

	public static void main(String[] args) {
		
		/*
		 * 버스요금 계산 프로그램
		 * 기본 요금 : 2000
		 * 1~5세 :무료
		 * 6~12세 : 50% 할인
		 * 13~18세 : 25% 할인
		 * 19~64세 : 0% 할인
		 * 65세 이상: 무료
		 */

        Scanner sc = new Scanner(System.in);
        
        System.out.println("나이: ");
        int age = sc. nextInt();
        
        int m = 2000;
        
   
        
		//int a = 2000; // 요금
		
		
		if(age <= 5 ) {
			System.out.println("무료");
			System.out.println(0 + "원");
		}else if(age <= 12) {
			System.out.println("50% 할인");
			System.out.println(m / 2 + "원");
		}else if(age <= 18) {
			System.out.println("25% 할인");
			System.out.println(1500 + "원"); // 1500원 계산법?
		}else if(age <= 64) {
			System.out.println("0% 할인");
			System.out.println(m + "원");
		}else if(age <= 65) {
			System.out.println("무료");
			System.out.println(m - m + "원");
			
			
			
		}
		
		sc.nextLine();
		
		System.out.println("종료");
		// 성공!!!!!!!!
		
					
			}
			
		}
		
 /* 강사님 풀이
  * 
  *
  * Scanner sc = new Scanner(System.in);
  * int age = 0;
  * double fee = 0; 버스 요금
  * double rate = 0; 할인율
  * 
  * System.out.println("나이: ");
  * int age = sc. nextInt();
  * 
  * if(age <= 65 || age <= 5) {
  *      rate = 0;
  *  }else if(age>=6 && age<=12) {
  *      rate = 0.5;
  *  }else if(age>=13 && age<=18) {
  *      rate = 0.75;
  *  }else if(age>=19 && age<=64) {
  *      rate = 1;
  *          
  *      
  *      fee = fee*rate;
  *      System.out.println(버스 요금 : " + fee + "원입니다.");
  *      
  *      System.out.println("종료");
  *      
  * 
  */
		
		
		
		
		
	


