package com.sist.collection;

import java.util.*;

public class Collection_total_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>(List.of("A","B","C","D","E"));
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==역순==");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}

}
