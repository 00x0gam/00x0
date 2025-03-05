package ch01.ex01;

//import java.util.Random;

public class 정렬01 {

	public static void main(String[] args) {

//		Random random =  new Random()
		
		int[] numArr = new int[10];
		int tmp;
		
		//랜덤하게 1~100사이 값을 배열에 넣는다.
		for(int i=0; i<10; i++) {
			tmp = (int)(Math.random()*100)+1; // +1를 입력해서 1~100까지 값
			numArr[i] = tmp; // 1~100까지 값 10번 랜덤으로 돌린 값 넣기
			
		}
		
		//랜덤하게 배열 저장된 값 출력
		for(int i=0; i<10; i++)
			System.out.print(numArr[i] + " "); // 띄어쓰기 좀...
		//10번 반복되어 저장된 값을 불러와서 출력하기
		//numArr[i] => 10개의 배열에 저장된 1~100까지의 랜덤 숫자들
		
	}

}
