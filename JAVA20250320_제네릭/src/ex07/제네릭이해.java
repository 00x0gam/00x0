package ex07;
/*
 * T : 타입인자..
 * T extends Number => T에게 전달되는 대상은
 * Number 이거나 Number 자손만 전달가능
 */
class Box<T extends Number>{
	private T obj;
	
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
 }

public class 제네릭이해 {

	public static void main(String[] args) {
		Box<Integer> ibox = new Box<>();
		ibox.setObj(10);
		
		Box<Double> dbox = new Box<>();
		dbox.setObj(10.2);
	
	}
}
