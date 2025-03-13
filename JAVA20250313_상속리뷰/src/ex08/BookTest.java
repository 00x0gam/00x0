package ex08;

public class BookTest {
	public static void main(String[] args) {
		
		Book[] books = new Book[5];

		books[0] = new Book();
		books[1] = new Book("집가고 싶다", "이은지", 500);
		books[2] = new Book("배고프다", "이은지", 100);
		books[3] = new Book("자고 싶다", "이은지", 100);
		books[4] = new Book("공모전 언제해", "이은지", 600);
		
		for(int i=0; i<books.length; i++)
			System.out.println(books[i].getBookInfo());
		
}
}
