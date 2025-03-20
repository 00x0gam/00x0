package ex03;

public class MeasureRunTimeExample {

	public static void main(String[] args) {

		System.out.println("--------시간 초 세기--------");
		int sum = 0;
		
		long time1 = System.nanoTime();
		
		for(int i=0; i <= 1000000; i++)
			sum += i;
		
		long time2 = System.nanoTime();
		
		System.out.println("합: " + sum); //1~1000000까지의 합
		System.out.println("소요시간: " + (time2 - time1)); //나노초 소요 정도...이건 컴 속도에 따라 다를 듯...
		
		
	}

}
