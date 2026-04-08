package com.sist.io;

import java.io.*;

public class Buffered_1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("");
			FileOutputStream fos = new FileOutputStream(fis);
			int i=0;
			byte[] buffer = new byte[1024];
			while ((i=bis.read(buffer,0,1024))!=-1) {
				bos.write(buffer,0,i);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
