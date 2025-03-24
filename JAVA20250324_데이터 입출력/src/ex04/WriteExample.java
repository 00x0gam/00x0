package ex04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		String path = "c:/jonog/test1.db";
	
		
	try {
		InputStream is = new FileInputStream(path);
		
		while(true) {
			int jonog = is.read();
			
			if(jonog == -1) break;
			//jonog == -1이란 더이상 읽어올 데이터가 없다(파일 끝)
			System.out.println(jonog);
		}
		
		is.close();
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}

	}

}
