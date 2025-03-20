package ex03;
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


class Box{
	private Object obj;
	
	public Object getObj() {
		return obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
 }

public class 제네릭이해 {

	public static void main(String[] args) {

		Box aBox = new Box(); 
		Box oBox = new Box();
		
		aBox.setObj("new Apple()"); //문자열로 변환 시
		oBox.setObj("new Orange()"); // 오브젝트라서 오류가 생기지 않는다.
		
		Apple ap = (Apple)aBox.getObj(); //error 발생
		Orange op = (Orange)oBox.getObj(); //error 발생
		
		System.out.println(ap);
		System.out.println(op);
	}
}
