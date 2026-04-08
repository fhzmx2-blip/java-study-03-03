package com.sist.stream;

import java.io.*;

public class Stream_1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					"C:\\Users\\sist15\\git\\java-study-03-03\\Chapter11_예외처리_1\\src\\com\\sist\\inter\\인터페이스_1.java");
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.println((char) i);
				// 한글이 깨짐 => 한글을 읽는 용도가 아님
			}
			
			BufferedReader br = new BufferedReader();

			while (true) {
				String s = br.readLine();
				if(s==null) {
					break;
				}
				System.out.println(s);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				fis.close();
			} catch (Exception ex) {

			}
		}
	}
}
