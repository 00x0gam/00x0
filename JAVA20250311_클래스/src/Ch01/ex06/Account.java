package Ch01.ex06;

public class Account {
	
	private int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	public void setBalance(int balance) {
		//MIN_BALANCE <= balance <= MAX_BALANCE 이렇게 쓸 수 없음!!
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) 
			this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

}
// 0 <= balance <= 1000000 값을 어떻게 넣는지 모르겠음
//MIN_BALANCE <= balance <= MAX_BALANCE 자바 문법에 맞지 않다.
//조건만 정하는 거라 중괄호 칠 필요없이 조건 입력 후 balance 값 입력하면 됨.
