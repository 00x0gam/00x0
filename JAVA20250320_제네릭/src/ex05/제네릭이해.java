package ex05;
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


class Box<T>{
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
		
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		Apple ap = aBox.getObj();
		Orange op = oBox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		/*
		 * 아까 실수 입력들이 전부 오류로 뜬다.
		 * 타입, 사용자의 실수를 전부 막아준다.
		 */
		

	}
}
