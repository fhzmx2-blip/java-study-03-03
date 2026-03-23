package com.sist.main;

class Saram{
	String name;
	String sex;
	static int age;
	public Saram(String name, String sex) {
		this.name=name;
		this.sex=sex;
		age=20;
	}
}
class Member extends Saram{
	public Member(String name, String sex) {
		super(name, sex);
	}
	public void display() {
		System.out.println(super.name);
		System.out.println(super.sex);
		Member.age=25;
		System.out.println(Member.age);
	}
}

public class 재사용_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m=new Member("홍길동", "남자");
		m.display();
	}

}
