package com.sist.regex;

public class 정규식_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1+2".matches("1\\+2"));
		System.out.println("a\\b".matches("a\\\\b"));
		System.out.println("^abc$".matches("\\^abc\\$"));
		System.out.println("c++".matches("c\\+\\+"));
		
	}

}
