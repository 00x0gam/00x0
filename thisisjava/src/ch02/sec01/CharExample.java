package ch02.sec01;

public class CharExample {

	public static void main(String[] args) {

		//ctrl + shitf + 방향키 아래로 볶붙이 됨
		//alt + 방향키 로 줄이동
		char c1 = 'A';
		System.out.println(c1);
		
		char c2 = 122;
		System.out.println(c2);
		
		char c3 = '가';
		System.out.println(c3);
		
		//char c4 = 44032;(한글 유니코드)/ 그냥 '감' 한글 적어도 됨.
		char c4 = 0xAC0F;
		System.out.println(c4);
		
		
	}

}

