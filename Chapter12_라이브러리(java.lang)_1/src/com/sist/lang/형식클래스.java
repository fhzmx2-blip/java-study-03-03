package com.sist.lang;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 형식클래스 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		DecimalFormat df = new DecimalFormat("#,###,###,###");
		int won=10000;
		System.out.println(df.format(won));
		
		int no=1;
		String name="홍길동";
		String sex="남자";
		String address="서울";
		String phone="010-1111-1111";
		int age=30;
		String content="홍길동입니다";
		
		String sql="INSERT INTO member VALUES("+no+", "+name+", "+sex+", "+address+", "
					+phone+", "+age+", "+content+")";
		System.out.println(sql);
		
		sql="INSERT INTO member VALUES("
				+"{0}, {1}, {2}, {3}, {4}, {5}, {6})";
		Object[] obj= {no, name, sex, address, phone, age, content};
		System.out.println(MessageFormat.format(sql, obj));
	}
}
