package ch02.sec01;

public class VaribleUseExam {

	public static void main(String[] args) {
		/*
		 * 변수명 작성
		 * 영문자, 숫자, _ -> 단, 숫자가 맨앞에 올 수 없다.
		 * (한글도 가능하지만 실무에 좋지않다.)(명확성 중요)
		 * (변수명 첫글자는 소문자로 기입한다.)(대문자는 실무에서 안 좋아한다.)
		 * (두 가지 단어가 변수명이 될 경우 뒷 글자는 시작을 대문자로 입력하기) = 카멜표기법
		 * 
		 * 예) 국어점수 => korScore(카멜표기법) or kor_score(스네이크표기법)
		 * 단, 변수명이 대문자로 표기 되어있다면 그 변수는 변경하지 않음을 뜻한다.
		 * 또는 앞에 final를 붙인다(값이 고정됨.)
		 * 	 */
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
	}

}
