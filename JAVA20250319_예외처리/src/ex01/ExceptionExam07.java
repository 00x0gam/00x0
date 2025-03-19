package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExam07 {

	public static void main(String[] args) {

	//하아... 닫기 2
	try(FileInputStream fis = new FileInputStream("file.txt")){	
	} catch (IOException e) {
		e.printStackTrace();
	}
	
//	FileInputStream fis = null;
	
//	try {
//		fis = new FileInputStream("file.txt");
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	}finally {
//		try {
//			fis.close(); //예외 처리 닫아줘!
//		} catch (IOException e) { //닫을 파일이 없어도 닫아줘!
//			e.printStackTrace();
//		} 
//	}
	
	try(FileInputStream fis2 = new FileInputStream("file.txt")){	
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("프로그램 종료!");

	}
}
