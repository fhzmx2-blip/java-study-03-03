package com.sist.lang;

class Student{
	private String name="홍길동";
	private String sex="남자";
	private int age =20;
	
	//toString이 재정의 되는 방식, 모르겠으면 아래 오버라이드를 주석처리하고 실행해 볼 것
	@Override
	public String toString() {
		String info = name+"\n"+sex+"\n"+age;
		return info;
	}
}

public class Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		
		System.out.println(std);
		System.out.println(std.toString());
//		Object o=new Student();
		
	}

}
