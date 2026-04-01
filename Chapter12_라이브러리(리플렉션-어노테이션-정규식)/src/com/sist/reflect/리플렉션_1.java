package com.sist.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Sawon {
	private String name;

	public Sawon() {
	}

	public Sawon(String name) {
		this.name = name;
	}

	public void info() {
		System.out.println("Sawon:info() Call.." + name);
	}
}

public class 리플렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sawon sa=new Sawon(); // 결합성이 강한 프로그램
		// 객체 생성 => ClassNotFoundException => CheckedException
		try {
			// => 클래스 정보 읽기
			Class clsName = Class.forName("com.sist.reflect.Sawon");
			// 클래스 정보에 생성자를 가지고 온다
			Constructor con = clsName.getConstructor();
			// 디폴트 생성자
			// 메모리 할당
			Object obj = con.newInstance();
			// Method 읽기
			Method m = clsName.getMethod("info");// 메소드 정보
			m.invoke(obj); // 실제 메소드 호출

		} catch (Exception ex) {
		}
	}

}