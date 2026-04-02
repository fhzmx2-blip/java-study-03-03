package com.sist.list;

import java.util.*;

public class List_2 {
	public static void main(String[] args) {
		String[] arr= {"1","1","2","3","4","5","6","5"};
		List<String> list = Arrays.asList(arr);
		
		Set<String> set=new HashSet(list);
		
		for (String l : list) {
			System.out.println(l);
		}
		
		System.out.println();
		
		for (String s : set) {
			System.out.println(s);
		}
	}
}
