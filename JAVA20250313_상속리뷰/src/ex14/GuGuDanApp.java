package ex14;

public class GuGuDanApp {

	public static void main(String[] args) {
		
		int[] numArr = new int[2];
		int tmp;
		
		for(int i=0; i<2; i++) {
			tmp = (int)(Math.random()*20)+1;
			numArr[i] = tmp;
		}
		
		for(int i=0; i<2; i++);
		
		int dan = numArr[0];
		int number = numArr[1];
		System.out.println("dan: "+ dan +", number: "+ number);
		
		
	}

}
