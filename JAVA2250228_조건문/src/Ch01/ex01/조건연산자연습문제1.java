package Ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제1 {

	public static void main(String[] args) {

		/*
		 * 키보드 통해서 국어점수 입력
		 * 70 이상이면 합격이 출력되고,
		 * 70 미만이면 불합격 메세지 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int score = sc.nextInt();  //정수값
		
		//if 문 사용
		if(score >=70) {
			System.out.println("합격입니다.");
		}
		
		sc.nextLine(); //sc.nextInt()를 사용할 경우 버퍼 클리너를 넣기
		
		if(score < 70)
			System.out.println("불합격입니다.");
		
		// 성공이긔!!!!!!!!!!!!!!!!!
		
	
		/*
		 * 강사님 풀이 삼항(조건)연산자
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("국어 점수: ");
		 * int score = sc.nextInt();     여기까진 맞게 했다!
		 * 
		 * 
		 *(조건) ? 참 : 거짓
		 * String result = (score >= 70) ? "합격입니다." : "불합격입니다.";
		 * System.out.println(result);
		 * 
		 */
		
	}

}
