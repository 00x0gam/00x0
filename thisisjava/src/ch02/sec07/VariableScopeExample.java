package ch02.sec07;

public class VariableScopeExample {

	public static void main(String[] args) {

		int num = 10;
		
		int num2 = 20;
		
		{
			int n1 = 20;
			
			num = num+1;
			System.out.println(num); //11
			
			System.out.println(n1); //20
			
		}
		
		/*
		 * System.out.println(n1);
		 * System.out.println(num); 
		 * 를 밖에서 입력하면 입력되지 않는다.
		 */
		
		
	}

}
