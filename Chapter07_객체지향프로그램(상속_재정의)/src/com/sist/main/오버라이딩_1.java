package com.sist.main;

class Parent{
	int a=10;
	public void display() {
		System.out.println("Parent:display() Call..");
	}
}
class Child extends Parent{
	int a=100;
	public void display() {
		System.out.println("Child:display() Call..");
	}
}

public class 오버라이딩_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		System.out.println("p.a="+p.a);
		p.display();
		
		Child c = new Child();
		System.out.println("c.a="+c.a);
		c.display();
	}

}
