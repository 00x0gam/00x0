package ch02.ex04;

public class BankAccount {
	
	
	private String owner;
	private double balance;
	
	public BankAccount( ) {} //디폴트 생성자
	
	public BankAccount(String owner, double balance) { //생성자 b1
		this.owner = owner;
		this.balance = balance;
		//this.owner
		//=> 객체 내부에 있는 private String owner;를 뜻함.
		//String owner는 외부 객체 있는 owner를 뜻함
	}
	
    double getBalance(){
    	return balance;
	}

	public void depostit(double amount) { //입금하기
		balance += amount;
	}
	
	public void withdraw(double amount) { //출금하기
		if(balance < amount) {
			System.out.println("잔액부족");
		}else {
			balance -= amount;
		}
	}
	
	
  
		
}
