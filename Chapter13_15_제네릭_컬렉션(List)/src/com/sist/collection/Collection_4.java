package com.sist.collection;

class Box<T>{
	T t;
	public void setT(T t) {
		this.t=t;
	}
	public T getT() {
		return t;
	}
}

public class Collection_4 {
	public static void main(String[] args) {
		Box box=new Box();
		Box<String> box1=new Box<String>();
	}
}
