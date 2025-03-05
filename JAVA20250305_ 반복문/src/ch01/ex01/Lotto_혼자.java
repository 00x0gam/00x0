package ch01.ex01;

public class Lotto_혼자 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		boolean flag = false; // if 에서 나오는 값 중복 방지
		
		System.out.println("이번 주 예상 로또 번호 : ");
		for(int ii=0; ii<5; ii++) { // 세로줄 5개 추가. ii로 변경
		
			for(int i=0; i<lotto.length; i++) { //0~5까지 랜덤 배열
				int temp = (int)(Math.random()*45)+1;
				//중복 체크하기
				for(int j=0; j<lotto.length; j++) {
					if(temp == lotto[j]) { // 서로 같으면
						flag = true;
					    break;
				 } // 자리비교 6번 반복 서로 번호가 같으면 브레이크
			} 
				
				if(flag != true) // 중복되지 않았을 때 처리
					lotto[i] = temp;
				else { // 중복되는 경우엔
					i--; // i값 하나 감소.
					flag=false; // 중복된 경우 true 값으로 변경된 값을
					            // 원래 상태로 변경(false)
					
				}
		
			} // 여기까지가 중복 없이 5줄 + 6개 배열 나열
			
			// 정렬 버블 추가
			int temp; // 중괄호 끝맺음 잘 확인하기
			for(int i=0; i<lotto.length; i++) {
				for(int j=0; j<lotto.length-1; j++) { 

					if(lotto[j]>lotto[j+1]) { 
						temp = lotto[j];       
						lotto[j] = lotto[j+1]; 
						lotto[j+1] = temp;      
					}
					
				}
				
			} // 중복 없이 5줄 + 6개 배열 나열 + 정렬 버블 상태
			
			for(int i=0; i<lotto.length; i++)
				 System.out.print(lotto[i] + " ");
			
			 System.out.println();
			// 중괄호 안에 넣어야지 5중 추가 코드가 인지해서 출력된다.
			}
		
		
	  }
	}

	
