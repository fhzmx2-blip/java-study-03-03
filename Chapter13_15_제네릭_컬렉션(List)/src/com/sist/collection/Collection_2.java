package com.sist.collection;

import java.util.*;

public class Collection_2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(3);
		list.add(4);
		list.add(8);
		list.add(7);
		list.add(9);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(6);
		
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("===========");
		ArrayList list2=new ArrayList(list.subList(1, 4));
		list2.add(10);
		list2.add(11);
		list2.add(12);
		
		for(Object obj:list2) {
			System.out.println(obj);
		}
		
		System.out.println("===========");
		Collections.sort(list);
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("===========");
		list.retainAll(list2);
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("===========");
		ArrayList list3 = new ArrayList();
		list3.addAll(list);
		
		for(Object obj:list3) {
			System.out.println(obj);
		}
		
		System.out.println("===========");
		
		list.containsAll(list2);
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
}
