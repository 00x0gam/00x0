package ex07;

public class Book {

	String title;
	String author;
	int price;
	
	String getBookInfo() { // 책 호출은 되는데 자바의 정석은 몰겠넹
		return "자바의 정석";
	}
	
	Book(){}
	
	Book(String title, String author, int price) {
		this.title=title;
		this.author=author;
		this.price=price;
		
		System.out.println("책 이름: " + title + ", 저자: " + author + ", 가격: "+ price);
		
	}
	
	void BookInfo() {
		System.out.println(getBookInfo());
		
	}
	
}
