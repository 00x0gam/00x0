package ex14;

public class GuGuDanExpr extends Multiplication {
	
	GuGuDanExpr() {}
	
	GuGuDanExpr(int dan){
		super(dan);
	}
	
	GuGuDanExpr(int dan, int number){
		super(dan, number);
	}
	
	public static void printAll() {
		for(int dan=2; dan<=9; dan++) {
			System.out.println("     ");
			for(int number=1; number<=9; number++) {
				System.out.println(dan + "*" + number + "=" + (dan*number));
			}
		}
	}

}
