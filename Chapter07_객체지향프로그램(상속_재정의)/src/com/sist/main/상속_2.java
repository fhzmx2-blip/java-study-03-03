package com.sist.main;

class Animal{
	public void run() {
		System.out.println("직립보행");
	}
	public void eat() {
		System.out.println("수저사용");
	}
}

class Dog extends Animal{
	@Override
	public void run() {
		System.out.println("개. 네발보행");
	}
	@Override
	public void eat() {
		System.out.println("개. 주둥이로 먹음");
	}
}

class Pig extends Animal{
	@Override
	public void run() {
		System.out.println("돼지. 네발보행");
	}
	@Override
	public void eat() {
		System.out.println("돼지. 주둥이로 먹음");
	}
}

class Super{
	int a, b;
	public void display() {
		System.out.println("a="+this.a);
		System.out.println("b="+this.b);
	}
}

class Sub extends Super{
	int c;
	public Sub() {
		super.a=100;
		super.b=200;
	}
	public void print() {
		System.out.println("a="+this.a);
		System.out.println("b="+this.b);
	}
}


public class 상속_2 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.run();
		dog.eat();
		
		Pig pig=new Pig();
		pig.run();
		pig.eat();
		
		Sub sub= new Sub();
		sub.print();
		sub.display();
	}
}
