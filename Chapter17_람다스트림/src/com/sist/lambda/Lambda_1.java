package com.sist.lambda;

import java.util.*;

@FunctionalInterface
interface Calc{
	public int calc(int a, int b);
	default void display() {
		System.out.println("aaa");
	}
	static void aaa() {
		System.out.println("bbb");
	}
}

public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Runnable r = new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("스레드 구동");
//			}
//		};
//		Runnable r =()->System.out.println("스레드 구동");
//		
//		new Thread(r).start();
		
		Calc add=(a,b)->a+b;
		Calc minus=(a,b)->a-b;
		
		System.out.println(add.calc(1, 2));
		System.out.println(minus.calc(1, 2));
	}

}
