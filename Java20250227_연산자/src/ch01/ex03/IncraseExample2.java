package ch01.ex03;

public class IncraseExample2 {

	public static void main(String[] args) {

		/*
		 * 증감연산자 ++
		 * 감소연산자 --
		 * 교재 81p
		 */
		
		int a = 1;
	    int b = 0;
	    
	    a = a+1;
	    b = a;
	    /*
	     * 여기서 b가 2인 이유는
	     * a = 1인 상태에서 a+1로 인해 2가 되기 때문에
	     * a = 2가 되어 b = a = 2로 대입된다.
	     */
	    
	    //System.out.println("a="+ a + ",b"+b);
	    System.out.printf("a=%d, b=%d\n", a,b);
		
		
	    int c = 1;
	    int d = 0;
	    
	    d = c;
	    c = c +1;
	    /*
	     * 이때는 d에 먼저 c를 대입하고
	     * 이후에 c에 c + 1를 했기에 
	     * d = 1, c = 2 가 된다.
	     */
	    
	    System.out.printf("c=%d, d=%d\n", c,d);
	    
	    
	}

}
