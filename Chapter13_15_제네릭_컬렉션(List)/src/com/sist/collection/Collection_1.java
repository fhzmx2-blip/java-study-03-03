package com.sist.collection;

import java.util.*;

public class Collection_1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();

		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		list.add("춘향이");
		list.add("이순신");

		for (String name : list) {
			System.out.println(name);
		}

		System.out.println("=============");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "." + list.get(i));
		}

		System.out.println("=============");
		list.add(2, "김두한");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "." + list.get(i));
		}

		System.out.println("=============");
		list.remove(3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "." + list.get(i));
		}

		System.out.println("=============");
		list.set(2, "강감찬");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "." + list.get(i));
		}

		System.out.println("현재인원: " + list.size());

		System.out.println("=============");
		list.removeAll(list);
		list.clear();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "." + list.get(i));
		}
		System.out.println("현재인원: " + list.size());
		if (list.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("차있음");
		}
	}
}
