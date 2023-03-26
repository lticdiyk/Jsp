package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {
	public static void main(String[] args) {
		/*
			Collection(수집)
			
			ArrayList<Object>, 	LinkedList (CRUD)   o-o-o-o-o-o-...
			검색			실시간 추가, 삭제	    0 1 2 3 4 5 
			
			HashMap(java) == Json(web) 
				-> 사전
				key:value - pair
				사과:apple 			
				
				key 값은 중복이 되지 않는다.
				Tree 구조
				
			TreeMap : HashMap + sorting(key)				 
		*/
		
	//	HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		
		// 추가
		hMap.put(101, "Lions");
		hMap.put(102, "Tigers");
		hMap.put(103, "Bears");
		hMap.put(104, "Twins");
		
		hMap.put(102, "Giants");
				
		System.out.println(hMap.size());
		
		// 모두 출력
		// iterator : 반복자(== 포인터(주소)) == cursor
		Iterator<Integer> it = hMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String value = hMap.get(key);
			System.out.println(key + ":" + value);
		}
		
		// 삭제
		String deleteVal = hMap.remove(104);
		System.out.println("삭제된 value:" + deleteVal);
		
		// 검색
		//     value            key 
		String value = hMap.get(101);
		
		boolean b = hMap.containsKey(102);
		if(b == true) {
			String val = hMap.get(102);
			System.out.println("value:" + val);
		}
		
		// 수정
		hMap.replace(103, "Eagles");
		
		it = hMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String val = hMap.get(key);
			System.out.println(key + ":" + val);
		}
		
		// HashMap의 장(강)점
		String str = "Hello";
		Integer in = 123;
		ArrayList<String> list = new ArrayList<String>();
		
		Map<String, Object> map = new HashMap<String, Object>();		
		map.put("문자열", str);
		map.put("숫자", in);
		map.put("목록", list);
		
		// 과일 5개를 map 추가하고 crud
		// String(key), String(key)
		Map<String, String> fMap = new HashMap<String, String>();
		
		// 추가
		fMap.put("apple", "사과");
		fMap.put("pear", "배");
		fMap.put("grape", "포도");
		fMap.put("banana", "바나나");
		fMap.put("orange", "오렌지");
		
		Iterator<String> it1 = fMap.keySet().iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			String v = fMap.get(key);
			System.out.println("key:" + key + " value:" + v);
		}
				
		// 검색
		boolean b1 = fMap.containsKey("peach");
		if(b1 == true) {
			System.out.println("같은 키값이 있습니다");			
		}else{
			fMap.put("peach", "복숭아");
			System.out.println("추가되었습니다");		
		}
		
		it1 = fMap.keySet().iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			String v = fMap.get(key);
			System.out.println("key:" + key + " value:" + v);
		}
		
		// TreeMap
		TreeMap<String, String> tMap = new TreeMap<String, String>( fMap );
		
		// 오름
	//	Iterator<String> it2 = tMap.keySet().iterator();
		
		// 내림
		Iterator<String> it2 = tMap.descendingKeySet().iterator();		
		
		while(it2.hasNext()) {
			String k = it2.next();
			String v = tMap.get(k);
			System.out.println("key:" + k + " value:" + v);
		}
		
		// original data 는 변경되지 않는다
		it1 = fMap.keySet().iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			String v = fMap.get(key);
			System.out.println("key:" + key + " value:" + v);
		}
		
	}
}



