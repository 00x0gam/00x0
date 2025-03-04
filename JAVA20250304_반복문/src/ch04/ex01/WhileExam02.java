package ch04.ex01;

public class WhileExam02 {

	public static void main(String[] args) {

		// 1~100까지 홀수 누적 값 구하기
		
		int sum = 0; //반복
		int i = 1;
		
		while(i<=100) { // 조건
			if(i%2==1)  // 실행
				sum +=i;
			i++;
		}
		System.out.println(sum);
	}

}
