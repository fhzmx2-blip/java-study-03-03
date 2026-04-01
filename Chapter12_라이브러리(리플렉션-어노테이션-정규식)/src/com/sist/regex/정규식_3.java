package com.sist.regex;

public class 정규식_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hllo".matches("he+llo"));
		System.out.println("heeeeeeeeello".matches("he+llo"));
		System.out.println("he".matches(".."));
		System.out.println("he".matches("h*."));
		System.out.println("he".matches("he*"));
		System.out.println("he".matches("h+e+"));
		
	}

}
