package ch01.ex03;

public class IncraseExample3 {

	public static void main(String[] args) {

		/*
		 * 증감연산자 => 전위, 후위
		 */
		
		int a = 1;
	    int b = 0;
	    
	    b = ++a; 
	    
	    /*
	     * 전위: 값 하나가 증가시키고 이후 a 값을 증가한다.
	     */
	    
	    //System.out.println("a="+ a + ",b"+b);
	    System.out.printf("a=%d, b=%d\n", a,b);
		
		
	    int c = 1;
	    int d = 0;
	    
	    d = c++; 
	    /*
	     * 후위: d는 c를 대입하고 이후에 c 값 하나가 증가한다.
	     */
	    
	    System.out.printf("c=%d, d=%d\n", c,d);
	    
	    
	}

}
