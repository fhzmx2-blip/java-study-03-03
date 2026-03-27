package com.sist.exception;
//에러메시지 처리
public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=0;
			if (b==0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다");
			}
			else {
				System.out.println(a/b);
			}
			System.out.println(a);
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
			System.out.println("타입: "+ex.getClass());
			ex.printStackTrace();
		}
	}

}
