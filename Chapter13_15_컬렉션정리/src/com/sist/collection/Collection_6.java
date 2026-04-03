package com.sist.collection;

import java.util.*;

class Student {
	private String name;
	private int age;
	
	Student(String name, int age){
		this.name = name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s=(Student)obj;
			return name.equals(s.name) && age==s.age;
		}
		return false;
	}
}

public class Collection_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("홍길동", 20);
		Student s2 = new Student("홍길동", 20);
		
		Set<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		
		if(s1==s2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(s1.equals(s2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		for(Student ss:set) {
			System.out.println(ss.getName()+" "+ss.getAge());
		}
		
		
		
		
	}

}
