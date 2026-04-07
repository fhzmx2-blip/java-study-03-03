package com.sist.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodVO {
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
	@Override 
	public String toString() {
		// TODO Auto-generated method stub
		return "번호:"+no+"\n"
				+"업체명:"+name+"\n"
				+"전화:"+phone+"\n"
				+"주소:"+address+"\n"
				+"평점:"+score+"\n"
				+"가격대:"+price+"\n"
				+"영업시간:"+time+"\n"
				+"주차:"+parking+"\n"
				+"테마:"+theme+"\n"
				+"소개:"+content;
				
		
	}
	
}
