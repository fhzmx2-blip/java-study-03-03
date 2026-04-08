package com.sist.stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Stream_3 {
	public Stream_3() {

		FileInputStream fis=null;
		FileOutputStream fos=null;
		BufferedReader buffer= new BufferedReader(null);
		try {
			fis = new FileInputStream("c:\\javaDev\\lombok-1.18.44.jar");
			fos = new FileOutputStream("c:\\javaDev\\lombok.jar");
			int i=0;
			byte[] buffer=new byte[1024];
			while((i=fis.read(buffer,0,1024))!=-1) {
				fos.write(buffer,0,i);
			}
			System.out.println("복사완료");
		} catch (Exception e) {
			e.printStackTrace();
			}
		finally {
			
		}
	}
}
