package com.sist.list;

import java.util.*;

public class List_1 {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		List<String> list = new LinkedList<String>();
		List<String> list = new Vector<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		for (String s:list) {
			System.out.println(s);
		}
		
	}
}
