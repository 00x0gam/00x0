package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExam10 {

	public static void main(String[] args) {

		int result = 0;
		try{
			result = divide(10,0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
	}
	
	public static int divide(int num1, int num2) throws ArithmeticException {
		
		if(num2 == 0)
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		
		int result = num1/num2;
		
		return result + 100;
	} 
}
