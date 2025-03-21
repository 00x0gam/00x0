package ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member{
	 String name;
	 int age;
	 
	 public Member(String name, int age) {
		 super();
		 this.name=name;
		 this.age=age;
	 }
	 
	 @Override
	 public String toString() {
		 return "Member [name=" + name + ", age="+age+"]";
	 }

	 @Override
	 public int hashCode() {
		 System.out.println("-------hashCode-------");
		 return name.hashCode()+age;
	 }
	 
	 @Override
	 public boolean equals(Object obj) {
		 System.out.println("-------equals-------");
		 Member m = (Member)obj;
		 return this.name.equals (m.name) && this.age == m.age;
	 } //각각 비교해보고 있음...
 }


public class SetExam01 {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet();
		
		set.add(new Member("고새싹", 5));
		set.add(new Member("고새싹", 5));
		set.add(new Member("고새싹", 5));
		
		for(Member m : set)
			System.out.println(m);
		
		System.out.println();
		System.out.println("총 객체 수: " + set.size());
		//인스턴트는 다르지만 동등한 객체이므로 객제 1개만 저장됨.
		
	}

}
