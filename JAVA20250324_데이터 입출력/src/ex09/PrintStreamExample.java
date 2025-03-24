package ex09;

import java.io.FileOutputStream;
import java.io.PrintStream;
public class PrintStreamExample {

	public static void main(String[] args) throws Exception{

		FileOutputStream fos = new FileOutputStream("c:/jonog/뿡.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("뿡을 출력합니다.");
		ps.printf(": %6d : %-10s :  %10s : \n", 1, "감자돌이", "감자");
		ps.printf(": %6d : %-10s :  %10s : \n", 2, "고구마스낵", "고구마");
		
		ps.flush();
		ps.close();
		
	}

}
