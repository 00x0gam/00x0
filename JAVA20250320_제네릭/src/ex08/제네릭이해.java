package ex08;

class Box<T>{
	private T obj;
	
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
 }

class BoxFactory{
	/*
	 * <T> : 제네릭 메소드 표시
	 * Box<T>: 반환 타입
	 * makeBox(T o) : 매개변수
	 */
	public static <T> Box<T> makeBox(T o){
		Box<T> box = new Box<>();
		box.setObj(o);
		return box;
		
	}
}

public class 제네릭이해 {
	
	public static void main(String[] args) {
		//제네릭 메소드호출
		Box<String> sbox = BoxFactory.makeBox("Sweet");
		System.out.println(sbox.getObj());
		
	/* 
	 * Box<String> sbox => <T>가 전부 String로 대체
	 * BoxFactory => Box<T> 반환 타입
	 * makeBox("Sweet") => makeBox(T o) 매개변수
	 * setObj - Sweet 입력하기
	 * 
	 * System.out.println(sbox.getObj());
	 * 에서 sbox.getObj() 반환하기.
	 */
		
		//제네릭 메소드호출
		Box<Double> dbox = BoxFactory.makeBox(7.58);
		System.out.println(dbox.getObj());
	}
}
