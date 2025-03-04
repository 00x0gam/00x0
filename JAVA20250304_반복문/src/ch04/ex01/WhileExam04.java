package ch04.ex01;

import java.util.Scanner;

public class WhileExam04 {

	public static void main(String[] args) {

		/* 구구단 
		 * for(int m=2; m<=9; m++) {
			System.out.printf("****%d단****\n*", m);
			for(int n=1; n<=9; n++) {
				System.out.printf("%dx%d=%d\n", m, n, m*n);
			}
			System.out.println();
		*/
		
		int i = 2;
		while(i<=9) {
			int j=1; // 절대 빼면 안된다!! while 문 안에만 있어줘~
			System.out.printf("****%d단****\n*", i);
			while(j<=9) {
				System.out.printf("%dx%d=%d\n", i, j, i*j);
				j++;
			}
			System.out.println();
			
			i++;
	}
		 
		
		
	}

}
