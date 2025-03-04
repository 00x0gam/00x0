package ch01.ex01;

public class 복습 {

	public static void main(String[] args) {

		/*
		 * 자료형 변수 = 값(초기값)
		 */
		
		int num=0;
		int num2=0;
		int num3=0;
		
		num = num +1;   // num (1)
		
 		num += 1;      // num (2)

 		num2 = ++num;  // 전위 연산자(증감), num (3)
		
 		num3 = num++; // 후위 연산자(증감), num (4)
 		
 		System.out.printf("%d %d %d\n", num, num2, num3);
 		
 		// num2 = 3은 이해가 됨
 		// num3 = 3에 먼저 num이 대입이 되어 3이고
 		// num는 num3에 먼저 대입된 후 후위 연산으로 증감했기에 4가 나온다.
		
		
	}

}
