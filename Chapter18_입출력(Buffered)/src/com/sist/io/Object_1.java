package com.sist.io;

import java.io.*;

class Student implements Serializable {
	private int hakbun;

	public int getHakbun() {
		return hakbun;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	private String name;
	private int kor, eng, math;

}

public class Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		std.setHakbun(1);
		std.setName("홍길동");
		std.setKor(90);
		std.setEng(80);
		std.setMath(90);

		ObjectOutputStream oos = null;
		FileOutputStream fis = null;
		try {
			fis = new FileOutputStream("c:\\java_data\\student.txt");
			oos = new ObjectOutputStream(fis);
			oos.writeObject(std);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			
		}
	}

}
