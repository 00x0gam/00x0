package ex02;

public class exam02 {

	public static void main(String[] args) {
		System.out.println("----------배열 복사----------");
		
//		int[] oldIntArray = new int[] {10, 20, 30, 40, 50};
//		
//		oldIntArray
//		oldIntArray2[0] = 10;
		
		int[] oldIntArray = {1,2,3}; //배열 3개에서
		
		System.out.println(oldIntArray.length);
		
		int[] newIntArray = new int[6]; //배열 6개로 늘리기
		
		//배열 복사
		for(int i = 0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		/*
		 * old가 확장되는 것이 아닌!
		 * new에서 생성된 배열에 old 값이 복사된다.
		 * 
		 * 배열을 늘리고 싶으면
		 * 새로운 배열을 만들어서 이주시키자.
		 */
		
		for(int i=0; i<newIntArray.length; i++)
			System.out.print(newIntArray[i] + " ");
		
		System.out.println();
		int[] intArray =  new int[10];
		
		System.arraycopy(newIntArray, 0, intArray, 0, newIntArray.length);
		//복사하고 싶은 배열(원본), 어디서부터 복사? : 붙여넣기할 배열(새삥), 어디서부터?, 복사할 항목 수
		
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
		System.out.println();
		
		System.out.println("----------향상된 for문----------");
		
		for(int i : intArray) // 뒤에 있는 배열 타입 지정
			System.out.print(i+ " ");
			
	} 

}
