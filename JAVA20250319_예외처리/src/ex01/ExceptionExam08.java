package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExam08 {

	public static void main(String[] args) {

		//예외 떠넘기기
		int result = 0;
		result = divide(10,0);
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
	}
	
	//함수 직접 처리
	public static int divide(int num1, int num2) {
		int result = 0;
		try {
			result = num1/num2;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	} //실행은 됨
}
