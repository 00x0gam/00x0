package ex04;

import java.util.StringTokenizer;

public class String_다양한클래스Example {

	public static void main(String[] args) {
		
		System.out.println("--------String Builder클래스--------");
		//문자열 클래스
		/*StringBuilder는 효율적인 문자열 조작 가능이 필요할 때
		 * StringTokenizer는 구분자로 연결된 문자열을 구분할 때
		 * 
		 */
		
        String data = new StringBuilder() //new StringBuffer()도 가능
				.append("DEF")// 기본값:문자열 => 문자열을 끝에 추가 / 끝 DEF
				.insert(0, "ABC")// 위치, 기본값:문자열 => 문자열을 지정 위치에 추가 /앞 ABC DEF
				.delete(3, 4)// 시작위치, 끝 위치 => 문자열 일부를 삭제 / ABCEF
				.replace(3,4,"Y")
                // 시작위치, 끝 위치, 문자열 =>
				// 문자열 위치 3에서 시작해서 4에 끝나는 사이를 Y로 변경하겠다 / ABCYF
				
				.toString();// 완성된 문자열 리턴
		System.out.println(data);
		
		
		System.out.println("--------StringTokenizer클래스--------");

		String data1 = "고새싹&김첨치&김춘봉";
		String[] arr = data1.split("&|,");
		// & , - 으로 구분된 문자열을 뽑아낼 경우
		// split() 메소드를 사용해야 한다.
		
		for(String token : arr) {
			System.out.println(token);
		//System.out.println(Arrays.toString(arr)); 이거 한줄로 충분
		}
		System.out.println();
		
		String data2 = "고새싹/김첨치/김춘봉"; 
		StringTokenizer st = new StringTokenizer(data2, "/");
		// 한 종류의 구분자만 있다면
		// StringTokenizer
		// => 첫 번째 매개값을 전체로 물려주기 :  data2
		//=> 두 번째 매게값을 구분자 : /
		
		while (st.hasMoreTokens()) {
			String token  = st.nextToken(); // nextToken() 문자열을 하나씩 가져옴
			System.out.println(token);
		}
		//그 외 
		/*
		 * int - countToken()는 분리할 수 있는 문자열 총 수
		 * boolean - hasMoreTokens()는 남아 있는 문자열이 있는지 여부
		 */
}

}
