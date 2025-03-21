package ex05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//import java.util.TreeSet;


public class SetExam01 {

	public static void main(String[] args) {
		
//		Set<String> list = new TreeSet<>();
		Set<String> list = new HashSet<>();
		//중복 불가, 오직 String만 넣을 수 있다.
		
//		list.add(10);
//		list.add(Person());
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		for(String str : list ) // 향상된 for
			System.out.println(str);
		System.out.println();
		
		System.out.println("-------------------------------");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next() + "\t");
		}
		
		System.out.println();
		
	}

}
