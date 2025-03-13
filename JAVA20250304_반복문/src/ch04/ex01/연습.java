package ch04.ex01;

public class 연습 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		//빈 배열 1~100 사이 랜덤하게 저장
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1; //1~100사이
		}
		//배열 값 출력
		for(int i=0; i<num.length; i++)
			System.out.print(num[i]+" ");
		
		System.out.println();
		System.out.println();
		
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<num.length; i++)
			sum += num[i];
		
		avg = (double)sum / num.length; 
		// 예시 총점 612일 때 더블을 붙이면 612.0/10으로 계산이 된다.
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		System.out.println();
		
		int max = num[0];
		int min = num[0];
		for(int i=0; i<num.length; i++) {
			if(max < num[i])
				max = num[i];
			
			if(min > num[i])
				min = num[i];}
		
		System.out.println("최대: "+max+", 최소: "+min);
		
		//정렬
		
		
	}

}
