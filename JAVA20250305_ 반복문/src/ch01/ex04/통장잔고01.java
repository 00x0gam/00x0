package ch01.ex04;

import java.util.Scanner;

public class 통장잔고01 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		
		while (true) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 : 2. 출금 : 3. 잔고 : 4. 종료");
			System.out.println("---------------------------------");
			
			System.out.println("선택> ");
			//문자열을 정수형으로 변환
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1:
				System.out.println("예금액> ");
				balance +=  Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("출금액> ");
				balance -=  Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.println("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;
			} // switch 문
//			sc.nextLine(); //버퍼 지우기
		} // while문
		

	}

}
