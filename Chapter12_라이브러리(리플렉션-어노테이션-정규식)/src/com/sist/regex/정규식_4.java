package com.sist.regex;

public class 정규식_4 {
	public static void main(String[] args) {
		System.out.println("color".matches("colou?r"));
		System.out.println("colour".matches("colou?r"));
		System.out.println("colouur".matches("colou?.r"));
		System.out.println("cat".matches("c.."));
	}
}
