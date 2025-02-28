package ch01.ex12;

import java.util.Scanner;

public class Example_nameage2 {

	public static void main(String[] args) {


		//이름, 나이 찍기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이: ");
		int age = sc.nextInt();
			
	    System.out.println("나이는 " + age);
	    
	    sc.nextLine(); // 버퍼 클리어
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		
		System.out.println("이름은 " + name);
		
		// 버퍼 클리어?
		
	
		
		
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("이름: ");
		 * String name = sc.nextLine();
		 * 
		 * System.out.println("이름은 " + name );
		 * 
		 * System.out.println("나이: ");
		 * String age = sc.nextLine();
		 * 
		 * System.out.println("나이는 " + age );
		 */
		

	}

}
