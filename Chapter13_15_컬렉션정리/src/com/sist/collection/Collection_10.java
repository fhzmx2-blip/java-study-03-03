package com.sist.collection;

import java.util.*;

public class Collection_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("포도", 300);
		
		System.out.println(map.get("사과"));
		System.out.println(map.get("바나나"));
		System.out.println(map.get("포도"));
		
		for(String key:map.keySet()) {
			System.out.println(key+);
		}
	}

}
