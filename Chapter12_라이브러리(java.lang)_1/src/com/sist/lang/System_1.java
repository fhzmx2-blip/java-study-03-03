package com.sist.lang;

public class System_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i=1;i<=10;i++) {
			if(i==a) {
				System.out.println("프로그램 종료");
//				System.exit(0);
				break;
				//break와 System.exit의 차이
			}
			System.out.println("i="+i);
		}
		System.out.println("시작");
		System.out.println("Go");
	}

}
