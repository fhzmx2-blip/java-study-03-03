package com.sist.regex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규식_정리 {
	public static void main(String[] args) {
//		String msg="개인 전화번호는 012-3445-6789"+"회사 전화번호는98-654-3210";
//		String regex="\\d{2,3}-\\d{3,4}-\\d{4}";
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(msg);
//		
//		while(m.find()) {
//			System.out.println("전화번호: "+m.group());
//		}
		
//		String email="test@emple.com";
//		String regex="^[A-Za-z]+@[A-Za-z]+\\.[A-Za-z]{2,}$";
//		boolean result=Pattern.matches(regex, email);
//		if(result) {
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
		
		Date date=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today=sdf.format(date);
		System.out.println(today);
//		String regex="[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";
		String regex="(\\d{4})-(\\d{1,2})-(\\d{1,2})";
		
		
	}
}
