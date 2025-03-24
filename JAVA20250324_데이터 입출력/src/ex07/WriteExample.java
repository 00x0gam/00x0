package ex07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {

		try {
			Writer writer = new FileWriter("C:/jonog/text.txt");
			
			char a = '별';
			writer.write(a);
			char b = '꿈';
			writer.write(b);
			
			char[] arr = {'잠', '빛','눈'};
			writer.write(arr);
			
			writer.write("꿈나라");
			
			writer.flush();
			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
