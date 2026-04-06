package com.sist.lambda;

import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Food{
	private int no;
	private String name;
	private String type;
	private String phone;
	private String address;
	private double score;
	private String parking;
	private String poster;
	private String time;
	private String content;
	private String theme;
	private String price;
}

class FoodManager{
	public static List<Food> fList=new ArrayList<Food>();
	static {
		try {
			FileReader fr= new FileReader("c:\\javaDev\\food.txt");
			StringBuffer sb = new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			fr.close();
			String[] datas = sb.toString().split("\n");
			for(String food:datas) {
				Food f = new Food();
				StringTokenizer st = new StringTokenizer(food, "|");
				f.setNo(Integer.parseInt(st.nextToken()));
				f.setName(st.nextToken());
				f.setType(st.nextToken());
				f.setPhone(st.nextToken());
				f.setAddress(st.nextToken());
				f.setScore(Double.parseDouble(st.nextToken()));
				f.setParking(st.nextToken());
				f.setPoster(st.nextToken());
				f.setTime(st.nextToken());
				f.setContent(st.nextToken());
				f.setTheme(st.nextToken());
				f.setPrice(st.nextToken());
				
				fList.add(f);
			}
		} catch (Exception e) {}
	}
}

public class Lambda_2 {
	public static void main(String[] args) {
		FoodManager fm = new FoodManager();
//		double sum = 0.0;
//		int len=fm.fList.size();
//		
//		for(Food f:fm.fList) {
//			sum+=f.getScore();
//		}
//		
//		System.out.printf("전체 평점 평균: %.2f\n", (sum/len));
		
		double avg = fm.fList.stream().collect(Collectors.averagingDouble(food->food.getScore()));
		System.out.printf("전체 평점 평균: %.2f\n", avg);
	}
}
