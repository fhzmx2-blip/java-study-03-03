package com.sist.io;

import java.io.*;

public class IO_3 {
	public static void main(String[] args) {
		try {
			
			File dir = new File("c:\\upload");
			if(!dir.exists()) {
				dir.mkdir();
			} 
			else {
				System.out.println("이미 존재하는 폴더");
			}
			
			
			File dir2 = new File("c:\\upload\\sawon.txt");
			if(!dir2.exists()) {
				dir2.createNewFile();
			}
			else {
				System.out.println("이미 존재하는 파일");
			}
			
		} catch (Exception ex) {}
	}
}
