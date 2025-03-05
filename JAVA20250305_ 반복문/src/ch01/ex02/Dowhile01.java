package ch01.ex02;

public class Dowhile01 {

	public static void main(String[] args) {

		int sum=0;
		for(int i=1000; i<=100; i++)
			sum += i;
	    System.out.println(sum); 
		
		int sum2=0;
		int i = 1000;
		while(i<=100) {
			sum2 += i;
			i++;
		}
		System.out.println(sum2);
		
		
		//do ~ while
		int sum3 = 0;
		int j = 1000; // 초기값
		do {
			j++; // 증가, 변동값
			sum3 += j; 
		
	}while(j<100); // 조건
	System.out.println(sum3);
	
	// do ~ while은 다른 for이나 while이 안된다는 걸
	// 한 번 봐보고 결정하자~ 하고 되게 한다... 가능충?
	}

}
