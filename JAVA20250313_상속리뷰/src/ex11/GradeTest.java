package ex11;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수: "); 
		int point = sc.nextInt();
		
		int[] nArr = new int[point]; //배열 생산
		
		for(int i=0; i<nArr.length; i++) {
			System.out.println("점수: "); //배열에 수 입력
			nArr[i] = sc.nextInt();
		}
		
		System.out.println();
		for(int i=0; i<nArr.length; i++) {
			System.out.print(nArr[i] + " "); //배열 나열
	    System.out.println();
		}
		
		
		GradeExpr expr = new GradeExpr(nArr); // int[] jumsu
		System.out.println("총점: " + expr.getTotal());
		System.out.println("평균 점수: " + expr.getAverage());
		System.out.println("좋은 점수: " + expr.getGoodScore());
		System.out.println("나쁜 점수: " + expr.getBadScore());
		
	}

}
