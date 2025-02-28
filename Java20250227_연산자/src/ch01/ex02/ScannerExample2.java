package ch01.ex02;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		
		//키보드 통해서 입력을 받기!
		
		System.out.print("문자 입력 : ");
		
		Scanner sc = new Scanner(System.in); 
		
		int str = Integer.parseInt(sc.nextLine());
		//String str = sc.nextLine(); 는 문자로 입력하는 것
		//int str = Integer.parseInt(sc.nextLine()); 는 정수로 입력하는 것
		
		// "a" + "b" => "ab"
		str = str + 10; 
		/*
		 * 앞 소스가 String str 일 경우
		 *  "10" + 10 는 문자와 문자를 합한 것
		 *  => "10" + "10" = 1010
		 */
	
		
		System.out.println("입력된 값: " + str);
		

	}

}
