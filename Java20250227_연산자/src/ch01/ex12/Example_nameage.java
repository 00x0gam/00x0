package ch01.ex12;

import java.util.Scanner;

public class Example_nameage {

	public static void main(String[] args) {


		//이름, 나이 찍기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		
		
		System.out.println("이름은 " + name);
		
		
        System.out.println("나이: ");
		String age = sc.nextLine();
		
		System.out.println("나이는 " + age);
		
		// 입력창은 만들 수 있는데 왜 값을 못 만들까...ㅠ 쉽게 생각하면 편한 것을
		
		
		
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
