package ch01.ex01;

public class Lotto03 {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6칸 짜리 int 배열
		 * 로또는 1~46 랜덤하게 저장
		 * 단, 중복 불가능
		 */
		
		
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			//중복 체크하기
			lotto[i] = i+1;
		}
		System.out.println("이번 주 예상 로또 번호 : ");
		for(int j=0; j<5; j++) { // 세로줄 5개 추가.
			
			for(int i=0; i<500; i++) { // 500번 섞어서 중복 방지하기
				int index = (int)(Math.random()*45); //0~44
				
				int temp =  lotto[0];
				lotto[0] = lotto[index];
				lotto[index] = temp;
				
			}
			
			//배열 45개 칸 중 앞자리 6자리만 출력
			 for(int i=0; i<6; i++)
				 System.out.print(lotto[i] + " ");
			 
			 System.out.println(); //한 줄 띄어서 다름 줄 추가.
			 // 중괄호 안에 넣어야지 5중 추가 코드가 인지해서 출력된다.
		}
		
		
		
	}

}
