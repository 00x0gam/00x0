package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열07 {

	public static void main(String[] args) {
		
		// 구구단 출력 교재랑 좀 다름
		
		for(int m=2; m<=9; m++) {
			System.out.printf("****%d단****\n*", m);
			for(int n=1; n<=9; n++) {
				System.out.printf("%dx%d=%d\n", m, n, m*n);
			}
			System.out.println();
		}
		
		
	}
		
}


