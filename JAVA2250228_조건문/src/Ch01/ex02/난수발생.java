package Ch01.ex02;

public class 난수발생 {

	public static void main(String[] args) {

		
		System.out.println(Math.random());
		// 0과 1사이 값이 랜덤으로 나온다.
		
		System.out.println((int)(Math.random()*6));
		// 앞에 (int)를 붙이면 정수만 나오게 한다
		//0~5사이의 정수
		
		System.out.println((int)(Math.random()*6) + 1 );
		//1~6사이의 정수
		
		System.out.println(Math.PI);  //Pi
		System.out.println(Math.abs(-1));  //절대값
		System.out.println(Math.sqrt(4));  //루트
		System.out.println(Math.sqrt(9));  //루트
		
		System.out.println(Math.floor(12.91));  //소수점 이하 절삭
		
		System.out.println(Math.max(10, 4));
		System.out.println(Math.pow(3, 3));
		
	}

}
