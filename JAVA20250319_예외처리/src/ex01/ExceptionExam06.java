package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExam06 {

	//내가 만들어주는 예외 처리 닫기
	public static void main(String[] args) {

	FileInputStream fis = null;

	//자바가 try/catch문 만들어줌
	try {
		fis = new FileInputStream("file.txt");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}finally {
		try {
			fis.close(); //예외 처리 닫아줘!
		} catch (IOException e) { //닫을 파일이 없어도 닫아줘!
			e.printStackTrace();
		} 
	}
	
	
	System.out.println("프로그램 종료!");

	}
}
