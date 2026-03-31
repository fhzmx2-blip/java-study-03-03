package com.sist.lang;

public class System_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("1. 정수 입력:");
			int num=System.in.read();
			System.in.read();
			System.out.println("2. 정수 입력:");
			int num2=System.in.read();
			System.in.read();
			
			System.out.println(num2);
			System.out.print("연산자 입력: ");
			int op=System.in.read();
			System.in.read();
			//in.read는 거의 사용하지 않음
		} catch (Exception ex) {}
	}

}
