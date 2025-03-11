package Ch01.ex01;

import java.util.Scanner;

/*
 * 반환 O, 매개변수 X
 */

public class Function03 {

	public static void main(String[] args) {

		
		String result =  add(); 
		
		System.out.println("result= " + result);
	}

	static String add() { //static 있어서 객체 안 만듬
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력: ");
		
//		String name = sc.nextLine();
//		return name;
		
		return sc.nextLine(); //=> 라인 하나로 바꿔서 입력 가능
	}
}
