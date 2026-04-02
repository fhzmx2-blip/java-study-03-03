package com.sist.apply;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FoodSystem {
	private static ArrayList<Food> fList = new ArrayList<Food>();
	static {
		try {
			FileReader fr=new FileReader("c:\\javaDev\\food.txt");
			int i = 0;
			StringBuffer sb = new StringBuffer();
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			fr.close();
			String[] datas=sb.toString().split("\n");
			for(String food:datas) {
				Food f = new Food();
				StringTokenizer st = new StringTokenizer(food,"|");
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
		} catch (Exception e) {
			// TODO: handle exception
		}
		
			
	}
	
	public ArrayList<Food> food_list(int page) {
	    ArrayList<Food> list = new ArrayList<Food>();
	    final int ROWSIZE = 12;
	    int start = (page * ROWSIZE) - ROWSIZE; 
	    int end = page * ROWSIZE;              

	    for (int i = start; i < end && i < fList.size(); i++) {
	        list.add(fList.get(i));
	    }
	    return list;
	}
	
	public int foodTotalPage() {
		return (int)(Math.ceil(fList.size()/12.0));
	}
	
	public Food foodDetail(int no) {
		return fList.get(no-1);
	}
	
	public ArrayList<Food> foodFind(String address){
		ArrayList<Food> list=new ArrayList<Food>();
		for (Food f:fList) {
			if(f.getAddress().contains(address)) {
				list.add(f);
			}
		}
		return list;
	}
}
