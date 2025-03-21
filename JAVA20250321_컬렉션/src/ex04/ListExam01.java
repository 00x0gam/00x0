package ex04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");

		list.add(0, "Robot"); // 0번에 로봇 넣기
		
		for(int i=0; i<list.size(); i++) // list 비교 키워드 size
			System.out.println(list.get(i));
		System.out.println();
		
		for(String str : list ) // 향상된 for
			System.out.println(str);
		System.out.println();
		System.out.println("-------------------------------");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		System.out.println("-------------------------------");
		
		System.out.println();
		
		list.remove(0); // 0번째 방 삭제
		System.out.println(list.get(0));
		// 기존 0번에 있던 Toy가 사라지고 Box가 들어옴.
		System.out.println(list.get(1));
		System.out.println(list);
		
		//System.out.println(list.get(2));
		//전부 뒤로 밀려서 2번을 볼 수가 없다.
		
		System.out.println();
		list.clear(); //전부 삭제, 뜨지 않음.
	}

}
