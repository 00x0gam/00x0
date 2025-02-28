package ch04.ex01;

public class ForExam02 {

	public static void main(String[] args) {

		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			//블럭만 수정
			//1~100까지 홀수 합
			if(i % 2 == 1) {
				sum += i;
			}
			/*
			 * 홀수는 1과 본인 숫자 말고는 없기 때문에
			 * 서로 같은 값을 나눌 때 나머지가 1이 나오는 값 = 홀수
			 * 그것을 서로 100까지 더하는 식을 하면 2500이 나온다.
			 */
			
			//System.out.println(i + 1);
			
		}
		
		System.out.println(sum);
		
		
	}
	

}
