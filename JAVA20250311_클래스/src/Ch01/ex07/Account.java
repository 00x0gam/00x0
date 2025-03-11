package Ch01.ex07;

public class Account { //싱글톤 패턴 교재 276p
	
	private int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	//순서 2
	private static Account acc = new Account();
	
	//순서 1
	private Account() {}
	
	//순서 3
	static Account getIntance(){ //사용되는 객체와 맞는 모습으로 지정
		return acc; 
	}
	
	public void setBalance(int balance) {
		//MIN_BALANCE <= balance <= MAX_BALANCE 이렇게 쓸 수 없음!!
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) 
			this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

}
