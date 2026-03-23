package com.sist.main;

class Human{
	String name;
	String sex;
	public Human() {
		name="심청이";
		sex="여성";
		System.out.println("Human() Call...");
	}
}

class Student extends Human{
	public Student(String name, String sex) {
		this.name=name;
		this.sex=sex;
	}
	public void display() {
		System.out.println(name);
		System.out.println(sex);
	}
}

class Sawon extends Human{
	String name;
	String sex;
	//이게 있으면 하단 display()의 super와 this가 따로 나오지만
	//없으면 Sawon()의 this가   Human의 값을 덮어씌우기 때문에 super도 this도 같은 것을 가리키게 됨
	
	public Sawon() {
		super();
		System.out.println("Sawon() Call...");
		this.name="박문수";
		this.sex="남성";
		//변수의 오버라이드
	}
	public void display() {
		System.out.println(super.name);
		System.out.println(super.sex);
		System.out.println(this.name);
		System.out.println(this.sex);
	}
}

public class 재사용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon std = new Sawon();
		std.display();
		
	}

}
