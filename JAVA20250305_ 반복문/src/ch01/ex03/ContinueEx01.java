package ch01.ex03;

public class ContinueEx01 {

	public static void main(String[] args) {

		//1~100사이에서 홀수 합 구하기
		int sum = 0;
		for(int i=0; i<=100; i++) {
			if(i%2 == 1) // 홀수 컴온
			sum += i; // 나머지 값이 1인 경우에만 서로 더해줘
		}
        System.out.println(sum);
		
        int sum2 = 0;
        for(int i=0; i<=100; i++) {
			if(i%2 == 0) continue; // 나눴는데 0이 아냐? 그럼 다시 위로 올라가
			sum2 += i;             // 다음 나와~ : 를 반복함 
        }
        System.out.println(sum2);
	}

}
