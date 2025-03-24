package ex06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) throws Exception{
//		String originalPath = "c:/jonog/dog.jpg";
//		String targetPath = "c:/test/dog.jpg";
		String originalPath = "c:/jonog/new.txt";
		String targetPath = "c:/test/new.txt";
		
	try {
		InputStream is = new FileInputStream(originalPath);
		OutputStream os = new FileOutputStream(targetPath);
		
		byte[] jonog = new byte[1024];
		
		while(true) {
			int num = is.read(jonog);
			System.out.println(num);
			
			if(num == -1) break;
			
			os.write(jonog, 0, num);
		}
		os.flush();
		is.close();
		os.close();
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}

	}

} // 아 이거 좀 신기하
