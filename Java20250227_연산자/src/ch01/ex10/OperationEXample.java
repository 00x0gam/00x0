package ch01.ex10;

public class OperationEXample {

	public static void main(String[] args) {

		int a = 1;
		
		//a = a +1; 어차피 더할 거 그냥 앞에 붙이자~
		a += 1;
		System.out.println(a); // 1 + 1 = 2
		
		a++;
		++a;
		System.out.println(a);
		// 2 + 1 => 3 +1 => 4 (혼자 있는 증감연산자는 단독으로 증가한다)
		
		a *=3; // 4 * 3 = 12
		System.out.println(a);
		
		a -= 10; // 12 - 10 = 2
		System.out.println(a);
	}

}
