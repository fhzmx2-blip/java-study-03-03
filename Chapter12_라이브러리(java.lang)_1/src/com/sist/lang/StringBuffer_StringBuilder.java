package com.sist.lang;

import java.util.StringTokenizer;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info="32,000원 | 2026년 4월 2일 발행 | 404쪽";
		long start1=System.currentTimeMillis();
		String[] data=info.split("\\|");
		for (String s:data) {
			System.out.println(s);
		}
		long end1=System.currentTimeMillis();
		System.out.println(end1-start1);
		
		
		
		System.out.println("=========StringTokener==========");
		long start2=System.currentTimeMillis();
		StringTokenizer st=new StringTokenizer(info,"|");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		long end2=System.currentTimeMillis();
		System.out.println(end2-start2);
		
	}

}
