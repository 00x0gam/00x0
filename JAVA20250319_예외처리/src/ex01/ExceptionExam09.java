package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExam09 {

	public static void main(String[] args) {

		//예외 떠넘기기
		int result = 0;
		try{
			result = divide(10,2);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
	}
	
	public static int divide(int num1, int num2) throws ArithmeticException {
		
		return num1/num2;
		
	/*
	 * 만약 result = divide(10,0);일 경우
	 * 
	 * int result = num1/num2;
	 * return result + 100;
	 */
	} 
}
