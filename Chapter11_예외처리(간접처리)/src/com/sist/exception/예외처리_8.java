package com.sist.exception;

class MyException extends Exception{
	private String msg;
	public MyException(String msg) {
//		this.msg=msg;
		super(msg);
	}
}

public class 예외처리_8 {
	public static void main(String[] args) {
		char c='A';
		try {
			if(c>='A' && c<='Z') {
				throw new MyException("소문자만 입력 가능");
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
