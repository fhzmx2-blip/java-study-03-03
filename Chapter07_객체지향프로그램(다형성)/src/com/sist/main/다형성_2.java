package com.sist.main;

class A{
	
}
class B extends A{
	
}

public class 다형성_2 {
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		
		A c=new B();
		c=new C();
	}
}
