/*
 * this => static 형식으로 되어있다
 * 
 */

package com.sist.main;

class Animal {
	String name="동물";
	public void run() {
		System.out.println("걷는다");
	}
	public void eat() {
		System.out.println("먹는다");
	}
}

class Dog extends Animal{
	int age=3;
}

class Cat extends Animal{
	
}

class Pig extends Animal{
	
}

public class 재사용_3 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();
		Pig pig = new Pig();
		pig.eat();
		System.out.println();
		System.out.println();
		Animal a = new Dog();
		a.eat();
		a=new Pig();
		a.eat();
		a=new Cat();
		a.eat();
	}
}
