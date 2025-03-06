package ch01.ex03;

public class 함수오버로딩 {

	public static void main(String[] args) {
		functionA(10, 2);

	}
	
	public static void functionA() {
		System.out.println("functionA()");
	}
	
	public static void functionA(int n) { // 정수
		System.out.println("void functionA(int n)");
	}
	
	public static void functionA(double n) { // 실수
		System.out.println("void functionA(double n)");
	}
	
	public static void functionA(int n1, int n2) { // 정수 2개
		System.out.println("void functionA(int n1, int n2)");
	}
	//functionA(10, 2); 입력한 값이 정수 2개 그래서 3번째 함수가 나온다.
	
	// 함수오버로딩
	// 다른 매개변수를 가진 같은 이름의 여러 함수

}
