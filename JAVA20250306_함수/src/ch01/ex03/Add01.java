package ch01.ex03;

/*
 * 2개 값을 입력받아서, 더하는 기능을 수행
 * 매개변수X, 반환X
 */
public class Add01 {

	public static void main(String[] args) {

		System.out.println("main함수 시작");
		
		
		add();
		
		
		System.out.println("프로그램 종료!");
		
	}
	
	public static void add() {
		
		int num1 = (int)(Math.random()*100)+1; //1~100
		int num2 = (int)(Math.random()*100)+1; //1~100
		
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		//(num1 + "+" + num2 + "=" + num1 + num2)
		//이렇게 입력하면 정수계산이 아닌 문자로 합해지게 된다
		
		System.out.println("add() 시작");
		
	}

}