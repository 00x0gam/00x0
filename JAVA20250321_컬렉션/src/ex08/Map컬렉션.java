package ex08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map컬렉션 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		map.put("고새싹", 3);
		map.put("삼색이", 7);
		map.put("콩물이", 1);
		map.put("고새싹", 5);
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		//문자, 정수 순서로 기입하기
		//문자는 키, 정수는 값(값만 저장하기)
		//총 Entry 수: 3
		
		String key = "고새싹";
		int value =  map.get(key); //(매개값을 주면서 값 리턴)
		System.out.println((key +": "+value));
		System.out.println();
		//고새싹: 5
		
		//key컬렉션 얻고 반복해서 키&값 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator(); //반복자
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ": "+ v);
		}
		System.out.println();
		//고새싹: 5
		//콩물이: 1
		//삼색이: 7
		
		//엔트리 Set 컬렉션 얻고, 반복해서 키&값 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();//반복자
		while(entryIterator.hasNext()) {
			Entry<String, Integer>entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + ": "+ v);
		}
		System.out.println();
		//고새싹: 5
		//콩물이: 1
		//삼색이: 7
		
		//키로 엔트릭 삭제
		map.remove("고새싹");
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		//총 Entry 수: 2
		
		
	}

}
