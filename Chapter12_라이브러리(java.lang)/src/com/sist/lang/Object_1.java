package com.sist.lang;

class Sawon{
	private String name;
	private String dept;
	public Sawon(String name, String dept) {
		this.name=name;
		this.dept=dept;
	}
	public void print() {
		System.out.println("이름: "+name);
		System.out.println("부서: "+name);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("객체메모리 해제");
	}
	
}

public class Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa = new Sawon("홍길동", "개발부");
		sa.print();
		sa=null;
		//finalize 호출됨
		System.gc();
	}

}
