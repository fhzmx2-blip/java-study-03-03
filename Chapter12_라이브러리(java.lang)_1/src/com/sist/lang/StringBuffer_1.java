package com.sist.lang;

import java.io.FileReader;

public class StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			String foodData="";
//			StringBuffer sb=new StringBuffer();
			StringBuilder sb=new StringBuilder();
			FileReader fr=new FileReader("c:\\javaDev\\food.txt");
			int i=0;
			long start=System.currentTimeMillis();
			while((i=fr.read())!=-1) {
//				foodData+=(char)i;
				sb.append((char)i);
			}
			fr.close();
			long end=System.currentTimeMillis();
			System.out.println(end-start);
		} catch (Exception ex) {}
	}

}
