package com.sist.exception;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in=null;
		try {
			in= new FileReader("C:\\Users\\sist15\\git\\java-study-03-03\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java");
			int i =0;
			while((i=in.read())!=-1) {
				int k=i;
				System.out.print((char)i);
			}
		} catch (IOException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
			} catch(Exception e) {}
		}
	}

}
