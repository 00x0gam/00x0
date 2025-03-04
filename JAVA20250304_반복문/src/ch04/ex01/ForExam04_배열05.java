package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열05 {

	public static void main(String[] args) {
		
		/*
		 * 7명 점수를 입력 받아서, 총점 평균을 구하기
		 */
		
		Scanner sc = new Scanner(System.in); //키보드 입력
		
		int[] student = new int[] {-1, -3, -700, 1, 2, 9, 3};
		//방을 그냥 만들고 값 넣어서 만들 수 있다.
		int sum = 0; 
		int max;
		int min;
		
	    for(int i=0; i<7; i++) { 
	    	//System.out.println(i+1 + "번 학생 자바점수>>");
	    	
	    	
	    	//num[i] = sc.nextInt(); 
	    	sum += student[i]; 

	    }
		
		
		double average = sum/7.0;
		System.out.printf("총점 : %d, 평균: %.2f\n", sum, average);
		System.out.println("7번째 값 출력: " + student [6]); 
		// 0 1 2 3 4 5 6 의 순서이기 때문에 7 넣으면 오류.
		
		System.out.println("------------------------------");
		
		max=student[0];
		min=student[0]; //둘다 배열 첫 번째만 넣으면 그들끼리 계산이 된다.
		
		for(int i=0; i<7; i++) {
			if(max < student[i]) // 배열 큰 값 계산하기
				max = student[i]; // 배열을 넣으면 제일 큰 수가 아닌 수는 자동탈락 
		
			if(min > student[i]) // 배열 작은 값 계산하기
				min = student[i]; // 배열을 넣으면 제일 작은 수가 아닌 수는 자동탈락
			
			/* min=0; 일 때
			 * 값이 나오지 않는 이유
			 * min의 첫 값을 0으로 지정해서
			 * 0보다 작은 배열은 없기 때문에
			 * 실행이 되지 않았다.
			 * 
			 * 그래서 최소값을 넣고 싶으면
			 * min의 첫 값을 최소값보다 큰 값으로 지정하면 된다!!!
			 */
		}
		
		System.out.println("최대값: " + max); //9
		System.out.println("최소값: " + min); //-700
		
		System.out.println("------------------------------");
		
		/*
		 * {-1, -3, -700, 1, 2, 9, 3}
		 * 키보드: 1입력하면, 출력: 1 값은 4번째 위치입니다.
		 * 키보드: -3입력하면, 출력: -3값은 2번째 위치입니다.
		 * 반복문, 조건문 이용...
		 * 
		 */

//		Scanner sc = new Scanner(System.in);
//		int[] student = new int[] {-1, -3, -700, 1, 2, 9, 3};
		
		int index = -1; 
		System.out.println("찾을 숫자를 입력하세요");
		int numA = sc.nextInt();
		
		for(int i=0; i<7; i++) { 
			if(numA == student[i]) {
				index = i;
				break;
			}
			}
		if(index != -1)
			System.out.printf("%d값은 %d번째 위치입니다.\n", numA,index + 1);
		else
	    	System.out.printf("%d값은 찾을 수 없습니다.\n", numA);
	    	
		/*
		 * int index = 0일 경우
		 * 배열의 첫 번째 값이 -1이라면,
		 * indxe는 원래부터 0이므로 if(index !=0)의 조건이
		 * 거짓이 됨. 찾았음에도 불구하고 "값을 찾을 수 없음이 출력이 된다.
		 * 
		 * -100이 괜찮은 이유는 초기값이 단순히
		 * "찾지 못함"을 의미하는 역할(!=)
		 * 정답 유무만 알면 도출되는 내용...
		 */
		System.out.println("------------------------------");
		
		/*
		 * {10, -1, -3, -700, 1, 2, 9, 3}
		 * 정렬해서 출력하기 
		 * -700, -3, 1, 2, 3, 9, 10
		 */
		
		
		
		}
		
	}


