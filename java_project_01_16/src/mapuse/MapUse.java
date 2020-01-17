package mapuse;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		//Map 인스턴스를 생성
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		
		map.put("baseball", "야구");
		map.put("soccer", "축구");
		map.put("basketball", "농구");
		map.put("car", "곽한구");
		
		//데이터 가져오기
		String obj = (String)map.get("soccer");
		System.out.println(obj);
		//출력할 땐 Object를 써도 되지만 다른 용도로 사용한다면 강제 형 변환을
		//해야 한다.
		
		//없는 key의 값을 가져올 때 - 언어마다 다르니 주의!
		Object value = map.get("volleyball");
		System.out.println(value);
		//자바는 null을 출력하지만 파이썬은 종료된다.
		
		map.put("soccer", "이게 운동이야?");
		obj = (String)map.get("soccer");
		System.out.println(obj.toUpperCase());
	
		//Map의 모든 데이터를 출력, key의 이름을 사용하지 않는다.
		System.out.println("====================================");
		
		//모든 key의 값을 가져오기
		Set<String> keys = map.keySet();
		//set을 순회
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		
		
		
		
		
	
	}

}
