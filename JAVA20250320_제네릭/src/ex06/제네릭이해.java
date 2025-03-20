package ex06;
/*
 * T : 타입인자..
 * T extends a => T에게 전달되는 대상은
 * a 이거나 a 자손만 전달가능
 */
class Box<T extends A>{
	private T obj;
	
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
 }
class A{}
class B extends A{}
class C extends B{}

class D{}
class Person{}
class Car{}

public class 제네릭이해 {

	public static void main(String[] args) {
		
		Box<A> aBox = new Box<>(); // A 본인
		Box<A> bBox = new Box<>(); // A에 상속 받는 중
		Box<A> cBox = new Box<>(); // A에 상속 받는 중
		
		
		//Box<A> dBox = new Box<>(); // A에 상속 받지 못해서 제한됨.
		//Box<person> pBox = new Box<>(); // A에 상속 받지 못해서 제한됨.
		//Box<Car> cBox = new Box<>(); // A에 상속 받지 못해서 제한됨.

		
	
	}
}
