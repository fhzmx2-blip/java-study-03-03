package com.sist.collection;

import java.util.*;

public class Collection_8 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
//		set.add("apple");
//		set.add("banana");
//		set.add("grape");
//		System.out.println(set.ceiling("blue"));
//		System.out.println(set.floor("blue"));
		set.add("박문수");
		set.add("홍길동");
		set.add("심청이");
		set.add("춘향이");
		set.add("이순신");
		set.add("강감찬");
		set.add("김두한");
		set.add("이산");
		System.out.println(set.ceiling("이순호"));
		System.out.println(set.floor("이순호"));
	}
}
