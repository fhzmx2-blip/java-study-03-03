package com.sist.io;

import java.io.*;

public class Object_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("c:\\java_data\\student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s=(Student)ois.readObject();
		
		System.out.println(s.getHakbun());
		System.out.println(s.getName());
		System.out.println(s.getKor());
		System.out.println(s.getEng());
		System.out.println(s.getMath());
		
	}

}
