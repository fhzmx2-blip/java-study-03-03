/*
 * try-catch 직접처리
 * throws 간접처리
 */

package com.sist.exception;

import java.io.FileReader;

public class 예외처리_1 {
	public static void main(String[] args) {
//		FileReader in=null;
//		try {
//			in=new FileReader("C:\\Users\\sist15\\git\\java-study-03-03\\Chapter11_예외처리_1\\src\\com\\sist\\inter\\인터페이스_1.java");
//			int i=0;
//			while((i=in.read())!=-1) {
//				System.out.print((char)i);
//			}
//			
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		finally {
//			try {
//				in.close();
//			}catch(Exception ex) {}
//		}
		try(FileReader in=new FileReader("C:\\Users\\sist15\\git\\java-study-03-03\\Chapter11_예외처리_1\\src\\com	\\sist\\inter\\인터페이스_1.java")) {
			int i=0;
			while ((i=in.read())!=-1) {
				System.out.print((char)i);		
		}
		}catch(Exception ex) {}
		
	}
}
