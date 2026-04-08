package com.sist.io;

import java.io.*;

public class Buffered_3 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("c:\\javaDev\\movie.txt");
//			fos=new FileOutputStream("c:\\javaDev\\movie2.txt");
			
//			int i = 0;
//			StringBuilder sb = new StringBuilder();
//			while((i=fis.read())!=-1) {
//				sb.append((char)i);
//			}
			
			long start=System.currentTimeMillis();
			
			BufferedReader in=new BufferedReader(new InputStreamReader(fis));
			StringBuilder sb=new StringBuilder();
			while (true) {
				String msg=in.readLine();
				if(msg==null) break;
				sb.append(msg+"\n");
			}
			long end=System.currentTimeMillis();
			
			System.out.println(sb.toString());
			System.out.println(end-start);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				
			}catch(Exception ex){
				
			}
		}
	}
}
