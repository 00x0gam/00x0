package ch02.sec07;

public class OperationPromotionExample {

	public static void main(String[] args) {

		byte result1 = 10 + 20;             //컴파일(같은) 단계에서 연산
		System.out.println("result1: " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;             //byte를 int 타입으로 변환 후 연산
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;      // long 타입으로 변환 후 연산
		System.out.println("result3: " + result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;           // int 타입으로 변환 후 연산
		System.out.println("result4: " + result4);
		System.out.println("result4: " + (char)result4);
		
		/*
		 * byte를 int 타입으로 변환 후 연산, long 타입으로 변환 후 연산,int 타입으로 변환 후 연산
		 * 3 모두 더 큰 영역을 수용할 수 있는 타입으로 변환하여 계산한다.
		 */
		
		int v8 = 10;
		int result5 = v8 / 4;              //정수 연산의 결과는 정수
		System.out.println("result5: " + result5);
		
		
		/* 
		 * 아래 소스 코드는 그냥 int로 계산을 하면 실수로 나오기 때문에 
		 * 마지막 문제 답이 0.5가 아닌 0.0으로 나온다 그래서 실수로 나오기 위해
		 * double로 타입 변환을 한다.
		 */
		int v9 = 10;
		double result6 = v9 / 4.0;         //int를 double 타입으로 변환 후 연산
		System.out.println("result6: " + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11;      //int를 double 타입으로 변환 후 연산
		System.out.println("result7: " + result7);
		
				
		
	}

}
