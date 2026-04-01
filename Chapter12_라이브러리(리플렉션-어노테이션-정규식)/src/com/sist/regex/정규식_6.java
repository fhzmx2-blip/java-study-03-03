package com.sist.regex;

public class 정규식_6 {
	public static void main(String[] args) {
		System.out.println("cat".matches("[a-z]at"));
		//[a-z],[A-Z],[0-9], [가-힣]
		System.out.println("코메디".matches("[가-힣]{3}"));
	}
}
