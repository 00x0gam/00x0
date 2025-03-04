package ch04.ex01;

import java.util.Scanner;

public class ForExam04_공부 {

	public static void main(String[] args) {
		
		/*
		 * 9명 학생 점수 입력 받아서, 총점, 평균구하기
		 * 점수 최대, 최소 구하기
		 * 배열 위치도 찾아보기
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] student = new int[] {0, 3, 89, 1, 72, 22, 65, 50, -14};
		
		int sum = 0;
		double average = 0;
		
		for(int i=0; i<9; i++) {
			sum += student[i];
		}
		
		average = sum/11.0;
		System.out.printf("총점:%d, 평균:%.2f\n", sum, average);
		System.out.println("--------------------------------");
		
		int max;
		max = student[0];
		int min;
		min = student[0];
		
		for(int i=0; i<9; i++) {
			if(max < student[i])
				max = student[i];
			
			if(min > student[i])
				min = student[i];
		}
		
		
	    System.out.println("최대값: " + max);
	    System.out.println("최소값: " + min);
	    
	    System.out.println("--------------------------------");
		
	    //질문하기?
	    int index = 1; //배열 앞 자리만 안 맞으면 될 듯?
	    System.out.println("찾는 숫자를 입력하시오.>>");
	    int numA = sc.nextInt();
	    
	    for(int i=0; i<9; i++) {
	    	if(numA == student[i]) { // ; 찍지 말기
	    		index = i;
	    }
	    }
	    
	    if(index != 1)
			System.out.printf("%d값은 %d번째 위치입니다.\n", numA, index + 1);
		else
	    	System.out.printf("%d값은 찾을 수 없습니다.\n", numA);
	    
		}
		
	}


