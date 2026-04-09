package com.sist.thread;

import java.util.concurrent.*;

public class Service_2 {
	public static void main(String[] args) throws Exception {
//		ExecutorService ex = Executors.newFixedThreadPool(20);
		
//		ex.submit(()->System.out.println("A"));
//		ex.submit(()->System.out.println("B"));
//		ex.shutdown();
		
//		for(int i=0;i<=10;i++) {
//			int n=i;
//			ex.submit(()->System.out.println("작업: "+n));
//		}
//		ex.shutdown();
		
		ExecutorService ex = Executors.newSingleThreadExecutor();
		Future<Integer> result = ex.submit(()->10+20);
		System.out.println(result.get());
		ex.shutdown();
	}
}
