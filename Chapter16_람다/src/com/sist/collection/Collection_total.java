package com.sist.collection;

import java.util.*;

public class Collection_total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>(List.of("홍길동","이순신","박문수","심청이","춘향이"));
		Iterator<String> it = names.iterator();
//		while(it.hasNext()) {
//			String name=it.next();
//			System.out.println(name);
//		}
		System.out.println("======");
		for(String name:names) {
			names.remove(name);
		}
		
		for(String name:names) {
			names.remove(name);
		}
	}

}
