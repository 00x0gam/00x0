package ch02.sec06;

public class stringExample {

	public static void main(String[] args) {

		//String 타입은 자바 기본 타입에 속하지 않는 참조 타입이다.
		String name = "이은지";
		String job = "홈 프로텍터";
		

		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "010-1234-5678\t이은지\t홈 프로텍터";
		System.out.println(str);
		

		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.\n");
		
		
	/*
	 * println은 행을 나눠눠.
	 * print는 행을 이어줘.
	 * (지금 띄어진 이유는 \n을 입력해서)
	 */
	}

}
