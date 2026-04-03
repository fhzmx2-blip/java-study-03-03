package com.sist.collection;

import java.util.*;



public class Collection_9 {
	public static void main(String[] args) {
		Map<String,AA> map=new HashMap<String, AA>();
		map.put("aa", new AA());
		
		AA a=map.get("aa");
		AA b=map.get("aa");
		AA c=map.get("aa");
		
		AA a=new AA();
		AA b=new AA();
		AA c=new AA();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
