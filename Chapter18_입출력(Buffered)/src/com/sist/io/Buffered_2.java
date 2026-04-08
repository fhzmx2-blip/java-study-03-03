package com.sist.io;

import java.io.*;

public class Buffered_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("문자입력");
			String msg=in.readLine();
			System.out.println(msg);
		} catch (Exception e) {
			
		}
	}

}
