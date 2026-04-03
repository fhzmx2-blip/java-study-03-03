package com.sist.collection;

import java.util.*;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Collection_2 extends JFrame {
	
	public static void print(List<?> list) {
		for(Object obj: list) {
			System.out.println(obj);
		}
	}
	
	public static void sum(List<? extends Number> list) {
		double total =0;
		for(Number n:list) {
			total+=n.doubleValue();
		}
//		return total;
	}
		
	public static void main(String[] args) {
		print(List.of("A","B","C"));
		print(List.of(1,2,3));
		
		System.out.println(sum(List.of(10,20,30)));
		System.out.println(sum(List.of(10.5,20.5,30.5)));
		
	}
}
