package com.sist.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규표현식_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="aasgasg";
		boolean result = msg.matches(".*\\d+.*");
		System.out.println(result);
		
		String res="맛있는, 맛있고, 맛있게, 맛있소, 맛있다, 맛없다";
		Pattern p=Pattern.compile("맛있.");
		Matcher m=p.matcher(res);
		while(m.find()) {
			System.out.println(m.group());
		}
		
		System.out.println("===데이터 추출===");
		String won="가격:30000원";
		String change=won.replaceAll("[^0-9]", "");
		System.out.println(change);
	}

}
