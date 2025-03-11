package Ch01.ex01;

/*
 * 반환 O, 매개변수 O
 */

public class Function02 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		int result =  add(num1, num2); 
		
		System.out.println("result= " + result);
	}

	static int add(int n1, int n2) { //static 있어서 객체 없이 계산 가능
		return n1+n2;
	}
}
