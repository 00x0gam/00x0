package ex14;

public class Multiplication {
	private int dan; 
	private int number; 
	
	 public Multiplication() {} 
	 
	 public Multiplication(int dan) { 
	  this.dan = dan; 
	 } 
	 
	 public Multiplication(int dan, int number){ 
	  this.dan = dan; 
	  this.number = number; 
	 } 
	 
	 void printPart() { 
	  if (number == 0) {         
	   for(int n=1; n <= 9; n++) 
	    System.out.print("\t" + dan + "*" + n + "="+ (dan*n) + "\t"); 
	   
	   System.out.println();
	   
	   }else { 
		   
	   System.out.println(dan * number + " = " + dan * number);
	  } 
	 }
	 
}
