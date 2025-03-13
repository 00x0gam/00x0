package ex09;

import ex08.Book;

public class ProductTest {

	public static void main(String[] args) {

		Product[] products = new Product[5];
		
		products[0] = new Product();
		products[1] = new Product("죠르디", 2, 32000);
		products[2] = new Product("대두 곰돌이", 1, 20000);
		products[3] = new Product("우사기", 6, 4000);
		products[4] = new Product("폼폼푸린 농담곰", 1, 80000);
		
		for(int i=0; i<products.length; i++)
			System.out.println(products[i].toString());
		
	}

}
