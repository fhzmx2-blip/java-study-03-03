package com.sist.lang;

import java.util.Objects;

class Human{
	String id, name;
	
	public Human(String id, String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Human h=(Human)obj;
		return name.equals(h.name)&&id.equals(h.id)
	}
	
	
}

public class Object_5 {
	public static void main(String[] args) {
		Human h1 = new Human("hong","홍길동");
		Human h2 = new Human("hong","홍길동");
		System.out.println(h1);
		System.out.println(h2);
		
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
	}
}
