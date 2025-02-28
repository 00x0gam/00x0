package ch01.ex02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		//키보드 통해서 입력을 받기!
		
		System.out.print("문자 입력 : ");
		
		Scanner sc = new Scanner(System.in);  // se = scanner 줄임말
		
		// 입력한 내용을 여기서 저장한다.
		String str = sc.nextLine();
		// sc.nextLine 는 문자값으로 내보낸다.
		// 그래서 앞에 String를 붙인다.
		
		
		System.out.println("입력된 값: " + str);
		// 그리고 답 출력
		
		/*
		 * 값을 보고 싶으면 run을 누르는 것이 아닌
		 * 답칸에 10을 직접 입력을 하고 Enter를 눌러 확인한다.
		 */
		
		System.out.println("정수 입력: ");
		// 정수 입력이라고 지정해서 정수만 넣을 수 있다.
		
		int num = sc.nextInt();
		// nextInt 는 정수값을 받아 int 타입으로 보낸다.
		System.out.println("입력된 값: " + num);

	}

}
