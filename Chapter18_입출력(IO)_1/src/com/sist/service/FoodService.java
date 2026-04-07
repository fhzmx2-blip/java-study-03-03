package com.sist.service;
import java.util.*;
import java.util.stream.Collectors;

import com.sist.dao.*;
import com.sist.vo.*;

public class FoodService {
	private List<FoodVO> fList;
	public FoodService() {
		fList=FoodDAO.getfList();
	}
	public List<Optional<FoodVO>> food_list(int page){
		List<FoodVO> list = new ArrayList<FoodVO>();
		int rowsize = 10;
		int start=(page*rowsize)-rowsize;
		int end=page*rowsize;
//		list=fList.subList(start, end);
//		List<Optional<FoodVO>> result = list.stream().collect(Collectors.toList());
		
		return fList.subList(start, end).stream().map(Optional::ofNullable).collect(Collectors.toList());
	}
	
	public FoodVO food_detail(int no)
	   {
		   return fList.get(no-1);
	   }
	
	public List<FoodVO> food_type_find(String type){
		return fList.stream()
				.filter(food->food.getType().contains(type))
				.collect(Collectors.toList());
	}
	
	public List<FoodVO> food_address_find(String addr)
	   {
		   return fList.stream()
				  .filter(food->food.getAddress().contains(addr))
				  .collect(Collectors.toList());
	   }
}
