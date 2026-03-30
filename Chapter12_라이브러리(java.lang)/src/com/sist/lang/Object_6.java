package com.sist.lang;

record Person(String name, int age) {
	
}

public class Object_6 {
	public static void main(String[] args) {
		Person p=new Person("홍길동", 20);
		System.out.println(p.name());
		System.out.println(p.age());
	}
}
