package com.sist.exception;

import java.io.FileReader;

public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader in= new FileReader(""); 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
