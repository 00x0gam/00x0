package ex09;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Product {
	private String name;
	private int balance;
	private int price;
	
	Product(){
		this("강아지 인형", 1, 50000);
	}
	
	Product(String name, int balance, int price){
		this.name=name;
		this.balance=balance;
		this.price=price;
		
	}
	
	@Override
	public String toString() {
		DecimalFormat fmr = new DecimalFormat("#,###");
		
		return name + " " + balance +
				" " + fmr.format(price) + "원" ;
	}

	public String getName() {
		return name;
	}

	public int getBalace() {
		return balance;
	}

	public int getPrice() {
		return price;
	}
	
	

}
