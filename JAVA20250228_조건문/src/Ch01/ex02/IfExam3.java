package Ch01.ex02;

import java.util.Scanner;

public class IfExam3 {

	public static void main(String[] args) {
		
		/*
		 * 국어점수
		 * 80이상이면 상
		 * 60이상 중
		 * 59이하면 하
		 * 를 if문으로 만들어보기
		 */

        
		int score = 65;
		
		
		if(score >= 80) {
			System.out.println("상");
	
		}else {
			if(score >= 60) {
				System.out.println("중");
			}else {
				System.out.println("하");
			
				//if ~ else ~ if ~ else로 반복적으로 사용하면
				//최상의 참인 결과만 뽑고 나머지는 지운다.
			
			
			}
		}
		
		
		System.out.println("종료");
		
		
	}

}
