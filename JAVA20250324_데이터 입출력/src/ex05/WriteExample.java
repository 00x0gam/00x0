package ex05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		String path = "c:/jonog/test2.db";
	
		
	try {
		InputStream is = new FileInputStream(path);
		
		byte[] jonog = new byte[2];
		
		while(true) {
			int num = is.read(jonog);
			System.out.println(num);
			
			if(num == -1) break;
			//jonog == -1이란 더이상 읽어올 데이터가 없다(파일 끝)
			for(int i=0; i<num; i++)
				System.out.println(jonog[i]);
		}
		
		is.close();
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}

	}

}
