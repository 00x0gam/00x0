package ch01.ex03;

public class BreakEx02 {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("* ");
			}
		    System.out.println();
		}

		    System.out.println("--------------");
		    
		    for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print("* ");
					
					if(i == j) break;
				} // j가 i에 맞춰 5씩 증가하다가 i와 j가 같을 때 멈춘다.
			    System.out.println();
		    }
		}
	}

