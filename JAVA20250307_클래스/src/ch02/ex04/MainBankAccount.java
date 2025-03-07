package ch02.ex04;

public class MainBankAccount {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount("이은지", 10000);
		
		b1.depostit(10000);
		b1.withdraw(100000); 
		//원금보다 큰 출금은 잔액 부족으로 처리 안됨
		b1.withdraw(2000);
	
		System.out.println(b1.getBalance());
	}
	

}
