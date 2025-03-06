package ch01.ex01;

/*
 * 이름, 전화번호, 나이, 국어, 영어, 수학 <정적> => 변수
 * 공부하기, 시험보기, 등교하기 <동적>  => 함수
 */
public class 클래스도입 {

	public static void main(String[] args) {

		String name ="조녹";
		String phone = "010-4444-4747"; 
		int age, kor, eng, math;
		age = 25;
		kor = 85;
		eng = 79;
		math = 22; //총 186
		
		공부하기(name);
		시험보기(kor, eng, math);
		등교하기(name);
		
		System.out.println("--------------------");
		
		String name2 ="포무";
		String phone2 = "010-7777-7474"; 
		int age2, kor2, eng2, math2;
		age = 23;
		kor2 = 73;
		eng2 = 65;
		math2 = 95; //총 233
		
		공부하기(name2);
		시험보기(kor2,eng2,math2); //?
		등교하기(name2);
		
	}
	//호출하기 전까지 출력되지 않는다
	public static void 공부하기(String name) {
		System.out.println(name + " 공부하기");
		
		
	}
	public static void 시험보기(int kor, int eng, int math) {
		int sum =  kor + eng + math;
		System.out.println("세 과목 합: " + sum);
		
		
	}
	public static void 등교하기(String name) {
		System.out.println(name + " 공부하기");
		
	}

}
