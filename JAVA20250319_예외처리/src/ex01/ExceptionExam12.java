package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExam12 {

	public static void main(String[] args) throws FileNotFoundException {

//		FileInputStream fis = new FileInputStream("./src/ex01/test.txt");//파일 찾음
		FileInputStream fis = new FileInputStream("src/ex01/test.txt");//파일 찾음
		System.out.println("프로그램 종료!");
	}
}
