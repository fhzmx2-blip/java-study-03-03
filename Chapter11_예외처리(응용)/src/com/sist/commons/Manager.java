package com.sist.commons;

import com.sist.vo.FoodVo;

public interface Manager {
	public FoodVo[] food_list(int page);
	public int food_total();
	public FoodVo food_detail(int no);
	public FoodVo[] food_find(String type, String fd);
	public FoodVo[] food_filter(String type);
}
