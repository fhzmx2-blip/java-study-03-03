package com.sist.lambda;

import java.util.*;

public class Stream_1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream().filter(n->n%2==0).map(n->n*n).forEach(System.out::println);
		
		for(int i:list) {
			if(i%2==0) {
				i=i*i;
				System.out.println(i);
			}
		}
		
		System.out.println("===============");
		List<String> names = Arrays.asList("king","scott","clerk");
		names.stream().map(name->name.toUpperCase()).forEach(name-> System.out.println(name));
		names.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
