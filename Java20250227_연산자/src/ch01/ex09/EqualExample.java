package ch01.ex09;

public class EqualExample {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		
		String str1 = "korea";
		String str2 = "korea";
		
		System.out.println(num1 == num2);
		//System.out.println(str1 == str2);  //문자를 비교할 땐 쓰지마라!
		System.out.println(str1.equals(str2));
		//문자열을 비교할 때는 equals()와 !equals()를 꼭 붙일 것
		
		String str3 = new String ("korea");
		String str4 = new String ("korea"); 
		
		//System.out.println(str3);
		//System.out.println(str4);
		//System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		System.out.println(str1.equals(str4));
		
		/*
		 * 왜 다르게 나올까?
		 * 문자열 타입은 변수 타입 저장 방식이 바르기 때문에...
		 * int는 저장이 같은 곳에서 되지만
		 * str은 각각 다른 곳에서 저장되는 방식이라
		 * 같은 문자도 다르게 인식 된다.
		 */
		
		System.out.println((5>2) & (3<1));
		
		System.out.println((5>2) ^ (3>1));
		System.out.println((5>2) ^ (3<1));
		System.out.println((5<2) ^ (3>1));
		System.out.println((5<2) ^ (3<1));
		
		System.out.println(!(5<2));
		System.out.println((5<2));
		
		
		
	}

}
