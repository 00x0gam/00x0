package ch02.sec07;

public class PromotionExample {
// 클래스 이름 바꾸고 싶은면 alt + shift + 
	public static void main(String[] args) {
		
		/* 
		 * 자동 타입 변환에 대한 설명
		 * '큰 허용 범위 타입 = 작은 허용 범위 타입'에서
		 * 작은 허용 타입이 큰 허용 범위 타입으로 자동 타입 되는 것
		 * 
		 * 예시)
		 * int a = 10
		 * short b = 20
		 * 
		 * a + b = 30으로 계산할 수 있게 자동 변환을 함
		 * i1 = (int)s1; 이런 방식으로~!
		 * 
		 * 반대도 있음 이건 강제 타입 변환
		 * 
		 * '작은 허용 범위 타입 = 큰 허용 범위 타입'
		 * 대신 (작은 허용 범위 타입) 안에서 강제 변환 할 수 있다.
		 * 
		 * 작은 허용 범위 타입에서 허용할 수 없은 큰 허용 범위 타입이라면
		 * 오류가 뜬다.
		 * 
		 * 예시)
		 * byte는 -128~127까지 허용 범위이다.
		 * 그래서 10를 허용할 수 있다.
		 * 
		 * int intValue = 10;
		 * byte byteValue = (byte) intValue; 로 강제 전환
		 * 
		 * 
		 * 
		 */
		
		int a = 10;
		String b = "korea";
		
		String s1 = "9";
		int num1 = 9;
		
		System.out.println(s1);
		System.out.println(num1);
		
		System.out.println(s1+num1);
		
		System.out.println( a+b);
		
		System.out.println( 10/3.0);
		
		int k = 10;
		int j = 3;
		System.out.println((double)k/j);
		
		
		
	}

}
