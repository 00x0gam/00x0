package Ch01.ex07;

public class MainAccount {

	public static void main(String[] args) {
		
		Account acc = Account.getIntance();
		acc.setBalance(100);
		System.out.println(acc.getBalance());
		
		Account acc2 = Account.getIntance();
		
		if(acc == acc2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		
		
	}

}
