package com.sist.lang;

public class Math_1 {
	public static void main(String[] args) {
		String[] names = {
				"이름1", "이름2", "이름3", "이름4", "이름5",
				"이름6", "이름7", "이름8",  "이름9", "이름10",
				"이름11", "이름12", "이름13", "이름14", "이름15"
		};
		
		System.out.println((int)Math.ceil(names.length/5.0));
		
		int rand=(int)(Math.random()*100);
		System.out.println(rand);
		
		double d=Math.round(10.4);
		System.out.println(d);
	}
	
	
}
