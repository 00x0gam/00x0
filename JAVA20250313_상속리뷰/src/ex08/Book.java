package ex08;

public class Book {

	String title;
	String author;
	int price;
	
	Book(){ //배열로 문제 푸는 거엿어.. ㅠㅠ
		title = "자바의 정석";
		author = "남궁뭐시기";
		price = 2000;
	}
	
	Book(String title, String author, int price) {
		this.title=title;
		this.author=author;
		this.price=price;
		
	}
	
	String getBookInfo() { 
		return "책 이름: " + title + ","
				+ "저자: " + author + ", 가격: "+ price;
	}
	
}
