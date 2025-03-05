package ch01.ex01;

public class Lotto02 {

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
		
		for(int i=0; i<500; i++) { // 중복 방지하기 => 500번 섞어서
			int index = (int)(Math.random()*45); //0~44 숫자들이..
			
			int temp =  lotto[0];  // 랜덤 숫자 뽑을거긔! 바뀔 숫자 temp에 있으삼!!! lotto[0] : 웅냐릐
			lotto[0] = lotto[index]; // 바꿔~ 바꿔~
			lotto[index] = temp;     // 옮기면서 나온 숫자 너도 temp에서 잠깐 기다리긔!! lotto[index] : 웅냐릐
			                         // 를 500번 하는거긔...
		}
		
		//랜덤 배열 45개 칸 중 앞자리 6자리만 출력
		 for(int i=0; i<6; i++)
			 System.out.print(lotto[i] + " ");
		
		
		
	}

}
