package ch01.ex01;

import java.util.Random;

public class 정렬02 {

	public static void main(String[] args) {

//		int seed = 100; // seed값을 넣어주면 랜덤숫자가 일정하게 나온다.
//		Random random =  new Random(seed);
		
		//seed값이 없으면 랜덤하게 추출
		Random random =  new Random();
		
		int[] numArr = new int[10];
		int tmp;
		
		//랜덤하게 1~100사이 값을 배열에 넣는다.
		for(int i=0; i<10; i++) {
			tmp = (int)random.nextInt(100); // +1를 입력해서 1~100까지 값
			numArr[i] = tmp; // 1~100까지 값 10번 랜덤으로 돌린 값 넣기
		}
		
		//랜덤하게 배열 저장된 값 출력
		for(int i=0; i<10; i++)
			System.out.print(numArr[i] + " "); // 띄어쓰기 좀...
		//10번 반복되어 저장된 값을 불러와서 출력하기
		//numArr[i] => 10개의 배열에 저장된 1~100까지의 랜덤 숫자들
		
		System.out.println();
		System.out.println();
		
		//최대값, 최소값 출력
		int max, min;
		//코드 구현
		
		max=numArr[0];
		min=numArr[0]; //꼭 지정된 배열 칸 [0]으로 지정하기
		
		for(int i=1; i<10; i++) { // 정렬 숫자랑 맞는지 확인하기
			                      // 0이 아닌 1을 넣은 이유
			if(max < numArr[i])   // 초기값 배열을 0을 넣으면 자기 자신까지 비교하기 때문에
				max = numArr[i];  // 시작점을 1로 지정, 0을 넣어도 상관없긴하다.
			
			if(min > numArr[i])
				min = numArr[i];
		}
		
		System.out.println("최대값: " + max + " 최소값: " + min);
		
		System.out.println();
		//총점, 평균
		
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<10; i++) {
			sum += numArr[i];
		}
		
		avg = sum /10.0; //앞에 미리 dounle avg = 0;을 입력해서 double를 빼도 좋다.
		
		System.out.printf("총점 : %d, 평균: %.2f\n", sum, avg);
		System.out.println();
		
		// 정렬_버블
		// 배열 앞 자리를 기준으로 뒷 배열 숫자보다 크면 뒤로 넘어가고
		// 숫자가 작으면 멈추고 그다음 큰 숫자 배열이 뒤로 넘어간다.
		// 그 모습이 버블 같아서 버블 배열이라고 한다... 긔엽네...
		// 랜덤으로 배치된 배열들이 가장 작은 수가 앞으로 가장 큰 수가 뒤로 간다.
		
		int temp;
		for(int i=0; i<10; i++) { // 10번 뒤로 넘어가는 용도
			for(int j=0; j<10-1; j++) { // 10번 각 배열을 비교해주는 용도
//				for(int j=0; j<10-1-i; j++) 이것도 가능
				//-1를 넣는 이유: 배열의 끝은 9이기 때문에 10이 존재하지 않는다.
				// 10번째 배열을 비교할 수 없기에 오류가 뜬다. 꼭 비교할 땐 -1를 넣도록
				// 반복 할 수록 끝 자리 수는 점점 비교할 필요가 없으므로 -1를 넣기는다.

				// i는 회전 횟수, 숫자가 정렬하는 건 j의 역할
				if(numArr[j]>numArr[j+1]) { // 배열의 앞뒤를 비교하긔 크면 뒤로 넘어감
					temp = numArr[j];       // 비교되면서 넘어가야 할 값은 temp에 저장
					numArr[j] = numArr[j+1]; // 비교했을 때 서로 값이 같다면
					numArr[j+1] = temp;      // temp에 저장
				}
				
			}
			
		}
		
		for(int i=0; i<10; i++) // 최종적으로 if으로 정리된 배열, 나와서 다시 배열 보여줘
			System.out.print(numArr[i]+" "); // 출력해줭
		
		
	}

}
