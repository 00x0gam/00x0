package ch01.ex02;

/*
 * 함수 2개 생성
 * 매개변수로 100 정수값을 전달하면
 * 함수 1은 1~100 사이 홀수 값을 리턴하고
 * 함수 2는 1~100 사이 짝수 값을 리턴한다.
 * 메인함수에서 두 함수를 호출하고, 각 전달받은 값을 출력한다. 
 */
public class FunctionExam02 {

	public static void main(String[] args) {
		int[] number = new int[10];
		
		for(int i=0; i<10; i++) {
			number[i] = (i+1)*10; //배열 10개 생성하기
		}
		
		for(int i=0; i<10; i++) 
			System.out.print(number[i]+ " ");
		System.out.println(); //10~100숫자넣기
		
		
		int resultA = evenSum(number);
		System.out.println(resultA); // 짝수합 출력
		
		int resultB = oddSum(number);
		System.out.println(resultB); // 홀수합 출력
	}
	
	public static int evenSum(int[] numA) { //짝수합 계산하기
		
		int sum = 0;
		for(int i=0; i<numA.length; i++) {
//			System.out.println(num1[i]+ " ");
			
			int num = numA[i] / 10;
			if(num % 2 == 0)
				sum += numA[i];
			}
		return sum;
	}
	
	public static int oddSum(int[] numB) { //홀수합 계산하기
		int sum = 0;
		
		for(int i=0; i<numB.length; i++) {
			if((numB[i] / 10) % 2 == 1) 
			sum += numB[i];
		}
		return sum;
	}	
	
} //대가리 아작날 듯



