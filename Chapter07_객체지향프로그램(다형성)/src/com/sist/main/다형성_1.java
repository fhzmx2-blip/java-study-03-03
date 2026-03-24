package com.sist.main;

class Super{
	int a,b;
	public Super() {
		a=100;
		b=200;
		System.out.println("Super.a="+a);
		System.out.println("Super.b="+b);
	}
	public void disp() {
		System.out.println("Super.disp() Call...");
	}
}

class Sub extends Super{
//	int a, b;
	public Sub() {
		System.out.println("Sub.a="+super.a);
		System.out.println("Sub.b="+super.b);
		System.out.println("Sub.a="+this.a);
		System.out.println("Sub.b="+this.b);
	}
	
	public void disp() {
		System.out.println("Sub.disp() Call...");
	}
}

public class 다형성_1 {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.disp();
		
		Super su = new Sub();
		su.disp();
	}
}
