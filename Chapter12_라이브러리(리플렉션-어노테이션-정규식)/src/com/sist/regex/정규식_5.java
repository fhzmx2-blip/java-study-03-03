package com.sist.regex;

public class 정규식_5 {
	public static void main(String[] args) {
		System.out.println("hello".matches("^h.*o$"));
		System.out.println("hello".matches("^h.*"));
		System.out.println("hello".matches(".*o$"));
	}
}
