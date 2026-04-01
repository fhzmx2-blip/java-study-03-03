package com.sist.regex;

public class 정규식_2 {
	public static void main(String[] args) {
		System.out.println("Hello".matches("H*.l*o"));
		System.out.println("ho".matches("h*.o"));
		System.out.println("hsdgsyho".matches("h*.o"));
		System.out.println("hhssfhshdfhdfhdfmn".matches("h*.*"));
	}
}
