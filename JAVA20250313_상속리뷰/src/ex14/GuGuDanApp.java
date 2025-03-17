package ex14;

public class GuGuDanApp {

	public static void main(String[] args) {
		
		int dan = (int)(Math.random()*20)+1;
		int number = (int)(Math.random()*20)+1;
		
		System.out.println("dan: "+ dan +", number: "+ number);
		
		// 1번 문제
		if( (dan>=1 && dan <=9) && (number>=1 && number <=9)) {
			GuGuDanExpr expr = new GuGuDanExpr(dan, number);
			expr.printPart();
		// 2번 문제	
		}else if ((dan>=1 && dan <=9) && number>=10){
			GuGuDanExpr expr = new GuGuDanExpr(dan);
			expr.printPart();
		// 3번 문제
		}else if(dan>=10) {
			GuGuDanExpr.printAll();
		}
		
		
		
		
		
//		int[] numArr = new int[2];
//		int tmp;
//		
//		for(int i=0; i<2; i++) {
//			tmp = (int)(Math.random()*20)+1;
//			numArr[i] = tmp;
//		}
//		
//		for(int i=0; i<2; i++);
//		int dan = numArr[0];
//		int number = numArr[1];
//		System.out.println("dan: "+ dan +", number: "+ number);
//		
//		if(dan <=9 && number <=9) {
//			GuGuDanExpr expr = new GuGuDanExpr(dan, number); //이 라인 넣는걸 몰랐어..
//			expr.printPart();
//		}else if (dan <= 9 && number>= 10) {
//			GuGuDanExpr expr = new GuGuDanExpr(dan);
//			expr.printPart();
//		}else if(dan>=10) {
//			GuGuDanExpr.printAll();
//		}
	
	}

}
