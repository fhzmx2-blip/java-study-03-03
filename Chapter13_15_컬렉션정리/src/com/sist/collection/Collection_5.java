package com.sist.collection;

import java.util.*;

public class Collection_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {
				"홍길동","심청이","춘향이","박문수","강감찬","을지문덕","이순신","김두한","홍길동","박문수"
		};
		List<String> list = Arrays.asList(name);
		for(String n:list) {
			System.out.println(n);
		}
		
		Set<String> set = new HashSet<String>();
		set.addAll(list);
		System.out.println();
		for (String s:set) {
			System.out.println(s);
		}
		System.out.println("다시 리스트로");
		List<String> list2=new ArrayList<String>();
		list2.addAll(set);
		for(String s:list2) {
			System.out.println(s);
		}
	}

}
