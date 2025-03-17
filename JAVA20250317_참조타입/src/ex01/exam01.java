package ex01;

public class exam01 {

	public static void main(String[] args) {
		//참조 변수에 대해
		
		System.out.println("----- == , != 연산 -----");
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2); // arr1과 arr2는 같은 배열을 참조 x, 구성원이 같아도 집이 달라
		System.out.println(arr2 == arr3); // arr2와 arr3은 같은 배열 참조 o, 집이 같다잖냐
		System.out.println();
		
		System.out.println("----- null에 대해 -----");
//		int[] intArray = null;
//		//배열에 암 것도 업는데 뭘 읽어
//		
//		String str =  null;
//		System.out.println("총 문자 수: " + str.length());
//		//문자열에 암 것도 없는데 뭘 읽어
		
		String hobby = "여행";
		hobby = null; // 여행 지우삼 => 쓰레기가되
		
		String kind1 = "자동차";
		String kind2 = kind1; //=> kind1(자동차) = kind2와 같다
		kind1 = null; // kind1 삭제
		System.out.println("kind2: " + kind1); // kind1(자동차) = kind2 미리 대입해서 자동차가 읽어짐
		System.out.println();
		
		System.out.println("----- 문자열 비교 -----");
		/* String kind1 = "고새싹";
		 * String kind2 = "고새싹";
		 * 이둘은 참조도 문자열도 같다.
		 * 
		 * String kind3 = new String("고새싹");
		 * String kind4 = new String("고새싹");
		 * 이들은 문자열은 같지만 참조는 다르다
		 * new를 사용하여 각자 새로운 참조로 대입됐기 때문...
		 * 분가.해.
		 * 
		 */
		System.out.println("주석 확인");
		System.out.println();
		
		System.out.println("----- 문자 추출 -----");
		String ssn = "200111164601";
		char sex = ssn.charAt(6); //6번째 숫자 뭐임?
		
		switch(sex) {
		
		case'1':
		case'3':
			System.out.println("홀수임.");
			break; //홀수면 이거 출력하고 멈춤
			
		case'2':
		case'4':
			System.out.println("짝수임.");
			break; //짝수면 이거 출력하고 멈춤
		
		}
		System.out.println();
		
		System.out.println("----- 문자열 길이 -----");
		String ssn1 = "200111164601"; //자릿수 12개
		int length = ssn.length();
		
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		}else {
			System.out.println("주민등록번호 자릿수가 아닙니다."); // => 출력 맞음
		}
		System.out.println();

		System.out.println("----- 문자열 대체 -----");
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String 입니다.";
		String newStr = oldStr.replace("자바", "JAVA"); //문자열 자리 제인지 해주삼
		
		System.out.println(oldStr); //난 변하지 않긔
		System.out.println(newStr); //난 새롭게 변하긔
		System.out.println();
		
		System.out.println("----- 문자 잘라내기 -----");
		String str = "아, 전내 배고프고 졸리다."; //ㅇㅈ.
		
		String fnum=str.substring(0,3); //배열에 맞춰서 0~3번 이내의 글자 꺼내줘 => 0 1 2
		System.out.println(fnum);
		
		String senum=str.substring(7); //배열에 맞춰서 7번 이후의 배열 언급해줘
		System.out.println(senum);
		System.out.println();
		
		System.out.println("----- 문자열 찾기 - 분리 -----");
		//문자열 찾기 전내 길어서 옮겨 적기 귀찮음 165, 166페이지임
		System.out.println();
		
		System.out.println("----- 객체를 참조하는 배열 -----");
		String[] strArray = new String[3];
		strArray[0] = "Jave";
		strArray[1] = "Jave";
		strArray[2] = new String("Jave");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[1] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
		System.out.println();
	}

}
