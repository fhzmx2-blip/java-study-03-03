package com.sist.stream;

import java.io.*;
import java.util.Scanner;

public class Write_1 {
	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("c:\\java_data\\sawon.txt");
			Scanner scan = new Scanner(System.in);
			System.out.println("이름 성별 전화번호");
			String name=scan.next();
			String sex=scan.next();
			String phone=scan.next();
			
			String data=name+","+sex+","+phone+"\n";
			fw.write(data);
			
			FileReader fr=new FileReader("c:\\java_data\\member,txt");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
