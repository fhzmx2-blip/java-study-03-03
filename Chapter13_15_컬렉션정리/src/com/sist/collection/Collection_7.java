package com.sist.collection;

import java.util.*;

public class Collection_7 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Random r = new Random(); 
		for(int i=0;i<10;i++) {
			int k=r.nextInt(100)+1;
			set.add(k);
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("실제 갯수"+set.size());
		
		TreeSet<Integer> set2= new TreeSet<Integer>();
		set2.addAll(set);
		for (Integer i:set2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=====50이상=====");
//		for (Integer i:set2) {
//			if(i>50) {
//				System.out.print(i+" ");
//			}
//		}
		System.out.println(set2.tailSet(50));
		
		System.out.println("=====50미만=====");
		System.out.println(set2.headSet(50));
		
		System.out.println("=====바로 위에 값=====");
		System.out.println(set2.higher(30));
		
		System.out.println("===같거나 큰 값===");
		System.out.println(set2.ceiling(50));
		
		System.out.println("=====바로 아래 값=====");
		System.out.println(set2.lower(50));
		
		System.out.println("===같거나 작은 값===");
		System.out.println(set2.floor(50));
		
		System.out.println();
		System.out.println(set2.first());
		System.out.println(set2.last());
	}
}
