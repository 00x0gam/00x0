package ch04.ex01;

public class WhileExam01 {

	public static void main(String[] args) {

		
		int sum = 0;
		int i = 1;
		
		while(i<=5) { // 조건식 => 조건이 만족이 되면 실행된다.
			sum +=i;  // 실행문
			i++; // 이거 없으면 무한 반복...
			      // 탈출 조건이 필요하다!
		}
		System.out.println("sum = " + sum);
	}

}
