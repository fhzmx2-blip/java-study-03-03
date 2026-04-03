package com.sist.collection;

import java.util.*;


class AAA{
	public void display(){
		System.out.println("AAA");
	}
}
class B{
	public void display(){
		System.out.println("BBB");
	}
}
class C{
	public void display(){
		System.out.println("CCC");
	}
}

public class Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] n = {"홍길동", "심청이", "박문수", "이순신", "강감찬"};
		List<String> names=new Vector<String>();
		names=Arrays.asList(n);
		
//		names.add("홍길동");
//		names.add("심청이");
//		names.add("박문수");
//		names.add("이순신");
//		names.add("강감찬");
		
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println("인원: "+names.size());
		
		if(names.isEmpty()) {
			System.out.println("인원없음");
		} else {
			System.out.println("인원 "+names.size()+"명 있음");
		}
		
//		names.add(new A());
//		names.add(new B());
//		names.add(new A());
//		names.add(new B());
//		names.add(new C());
//		names.add(new A());
//		names.add(new B());
//		names.add(new C());
//		names.add(new C());
//		names.add(new A());
//		names.add(new B());
//		
//		A a = null;
//		B b = null;
//		C c = null;
//		
//		for(Object o:names) {
//			if (o instanceof A) {
//				o=(A)o;
//			}
//			if (o instanceof B) {
//				o=(B)o;
//			}
//			if (o instanceof C) {
//				o=(C)o;
//			}
//		}
			
	}

}
