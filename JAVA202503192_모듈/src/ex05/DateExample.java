package ex05;

import java.text.*;
import java.util.*;

public class DateExample {

	public static void main(String[] args) {

	//날짜 뽑기!
		
		Date now = new Date();
		
//		String strNow1 = now.toString();
//		System.out.println(strNow1);
		
		
		
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		System.out.println();
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sdf.format(now));
	}

}
