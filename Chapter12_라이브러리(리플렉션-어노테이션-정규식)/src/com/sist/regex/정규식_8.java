package com.sist.regex;

public class 정규식_8 {
	public static void main(String[] args) {
		System.out.println("abcabc".matches("(abc)+"));
		
		System.out.println("aabb".matches("(a+b+)"));
	}
}
