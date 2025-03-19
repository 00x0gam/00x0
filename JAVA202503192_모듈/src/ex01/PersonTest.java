package ex01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor //디폴트 생성자
@AllArgsConstructor
class Person { //public 꼭 삭제...

	private String name;
	private int age;
	
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//		
//	}
	
	//생성자는 서로 객체를 만들 때 비교하면 같지 않다고 뜨는데
	//이거 쓰면 생성자에 입력된 객체들도 서로 같은지 비교할 수 있음.
	
	@Override
	public int hashCode() {
		System.out.println("---------hashCode---------");
		int result = name != null ? name.hashCode():0;
		
		//자바에서는 객체 해시를 생성할 때
		//필드들의 해시를 혼합할 목적으로 주로 31 소수값을 곱해줌.
		result = 31*result + age;
	
		return result;
	}
	
	//System.out.println(p3.equals(p4));
	//p3 = this, p4 = o
	@Override
	public boolean equals(Object obj) {
		System.out.println("---------equals---------");
		Person o = (Person)obj;
		
		return this.age == o.age && this.name == o.name;
	}
}
	
	
public class PersonTest {	
	
	public static void main(String[] args) {

		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		
		System.out.println(str1.equals(str2));
		
		Person p1 = new Person("홍길동", 10);
		Person p2 = new Person("박길동", 20);
		
		System.out.println(p1.equals(p2));
		
		Person p3 = new Person("홍길동", 10);
		Person p4 = new Person("홍길동", 10);
		
		System.out.println(p3.equals(p4));
	
	
	}

}
