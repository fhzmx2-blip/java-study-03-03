package com.sist.regex;

public class 정규식_7 {
	public static void main(String[] args) {
		System.out.println("dog".matches("dog|cat|pig"));
		System.out.println("gif".matches("gif|jpg|png"));
		System.out.println("yes".matches("y(es)?"));
		System.out.println("ye".matches("ye?"));
	}
}
