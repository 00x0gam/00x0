package Ch01.ex01;

/*
 * 반환 O, 매개변수 O
 */

public class Function01 {

	public static void main(String[] args) {

		Function01 f1 = new Function01(); // => 객체 생성해주기
		
		int num1 = 10;
		int num2 = 20;
		
		int result =  f1.add(num1, num2); //객체 반환값 들어가는 곳
		
		System.out.println("result= " + result);
	}

	int add(int n1, int n2) { //반환값이 어디로 가야할까요? => 객체
		return n1+n2;
	}
}
