package com.sist.lang;

import java.lang.reflect.Method;

public class Object_7 {
	public static void main(String[] args) {
		String str="Hello";
		Class clsName=str.getClass();
		System.out.println(clsName.getName());
		Object obj=new String("Hello");
		System.out.println(obj.getClass());
		
		clsName=String.class;
		System.out.println(clsName.getName());
		Method[] methods=clsName.getDeclaredMethods();
		for(Method m:methods) {
			System.out.println(m.getName());
		}
	}
}
