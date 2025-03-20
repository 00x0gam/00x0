package ex05;


class DBox<L,R>{
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
	
	
}
class Person{} //이거 추가하면 됨

public class MutiTypeParam {

	public static void main(String[] args) {

		DBox<String, Integer> iBox = new DBox<String, Integer>();
		
		iBox.set("고새싹", 5);
		System.out.println(iBox);
		
		DBox<Person, String> pBox = new DBox<Person, String>();
		
		pBox.set(new Person(), "한국인"); 
		//new Person을 추가 하고 싶으면
		//Person 클래스를 만들어 주면 됨;; tq 
		
		System.out.println(pBox);
	}

}
