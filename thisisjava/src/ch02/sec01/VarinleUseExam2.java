package ch02.sec01;

public class VarinleUseExam2 {

	public static void main(String[] args) {


		int x = 1;
		int y = 2;
		int z = 3;
		
		System.out.println("before : ");
		System.out.println("x = " + x +", "+"y = " + y +", "+"z = " + z);		
		
		
		int a = x;
		x = y;
		y = a;
		int b = y;
		y = z;
		z = b;
		
		System.out.println("after : ");
		System.out.println("x = " + x +", "+"y = " + y +", "+"z = " + z);	
		
		/* float f1 = 10.0f;에서 숫자 끝에 f를 붙여야하는 이유:
		 * dounle이 기준!/ float를 4byte(int) 작은 곳에 넣을 수 없어서
		 * 
		 * float(4) < double(8)
		 * double > float > long > int > short > byte
		 * 실수가 정수보다 영역이 더 크다.
		 * 
		 *  그래서 long l1 = 1000; 소스를 float에 넣을 수 있다.
		 *  f1 = l1 이 가능해진다.
		 *  (long 1l에 l를 붙이는 이유: int가 기준이라 l을 붙임, f랑 비슷한 원리)
		 * 
		 */
    	
		

	}

}
