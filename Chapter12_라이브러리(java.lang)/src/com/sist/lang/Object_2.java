package com.sist.lang;

class Member implements Cloneable{
	String name="홍길동";
	public void display() {
		System.out.println("이름: "+name);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class CallByReference {
	public void change(Member m) {
		m.name="박문수";
	}
}

public class Object_2 {
	public static void main(String[] args) throws CloneNotSupportedException {
//		Member m1=new Member();
//		m1.display();
//		Member m2=m1;
//		m2.name="심청";
//		m2.display();
//		m1.display();
//		
//		CallByReference c= new CallByReference();
//		c.change(m1);
//		m1.display();

		Member m1 = new Member();
		Member m2 = (Member)m1.clone();
		m1.name="AAA";
		m2.name="BBB";
		m1.display();
		m2.display();
	}
}
