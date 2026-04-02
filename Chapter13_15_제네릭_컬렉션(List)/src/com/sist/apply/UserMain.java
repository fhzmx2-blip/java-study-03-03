package com.sist.apply;

import java.util.*;

public class UserMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("페이지 입력");
		int page=scan.nextInt();
		
		FoodSystem fs=new FoodSystem();
		ArrayList<Food> list=fs.food_list(page);
		
		for(Food f:list) {
			System.out.println(f.getNo()+"."+f.getName());
		}
	}

}
