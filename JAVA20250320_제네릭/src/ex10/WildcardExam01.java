package ex10;

class Box<T>{
		private T obj; 
		
		public T getObj() {
			return obj; 
		}
		
		public void setObj(T obj) {
			this.obj = obj; 
		}
		
		@Override
		public String toString() {
			return (String)obj;
		}
		
      }

class A{}
class B extends A{}
class C extends B{}
class D{}

class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.getObj();
			
	}
	
	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
	
	//                           상한 제한
    public static void peekBox1(Box<? extends B> box) {
		System.out.println(box);
    }
    
    //                           하한 제한
	public static void peekBox2(Box<? super C> box) {
		System.out.println(box);
		
        }
	}

public class WildcardExam01 {
	public static void main(String[] args) {

		Box<A> box = new Box<>();
		box.setObj(new A());
		
//		Unboxer.peekBox1(box);
		//B 상한 제한을 하고 있는 상태에서
		//A 를 넣으니 오류가 생기는 중...
	}

}
