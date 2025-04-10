package ex01;

import lombok.Getter;
import lombok.Setter;

class Apple{
		@Override
		public String toString() {
			return "I am an apple.";
		}
     }	
		
class Orange{
	@Override
	public String toString() {
		return "I am an orange.";
	}
 }

@Setter @Getter
class appleBox{
	private Apple ap;
	
//	public Apple getAp() {
//		return ap;
//	}
//	
//	public void setAp(Apple ap) {
//		this.ap = ap;
//	}

 }

@Setter @Getter
class orangeBox{
	private Orange op;
	
//	public Orange getOp() {
//	    return op;
//  }
//
//  public void setOp(Orange op) {
//	   this.op = op;
//  }
	
}

public class 제네릭이해 {

	public static void main(String[] args) {

		appleBox aBox = new appleBox(); // 사과 클래스만 담는다
		orangeBox oBox = new orangeBox(); // 오렌지 클래스만 담는다
		
		aBox.setAp(new Apple()); // 사과박스 사과 담는다
		oBox.setOp(new Orange()); // 오렌지박스 오렌지 담는다
		
		Apple ap = aBox.getAp();
		System.out.println(ap);
		
		Orange op = oBox.getOp();
		System.out.println(op);
	}
}
