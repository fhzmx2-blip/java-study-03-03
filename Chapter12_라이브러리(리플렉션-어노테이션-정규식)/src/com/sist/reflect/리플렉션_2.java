package com.sist.reflect;

import java.lang.reflect.Field;

class Student{
	private String name="홍길동";
}

public class 리플렉션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student std = new Student();
			Class cls=std.getClass();
			Field f=cls.getDeclaredField("name");
			f.setAccessible(true);
			System.out.println(f.get(std));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
