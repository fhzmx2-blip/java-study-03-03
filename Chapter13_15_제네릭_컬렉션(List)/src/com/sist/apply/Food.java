/*
 * 1|
 * 강릉초당두부집|
 * 음식점-한식|
 * (033) 644-1234|
 * 강원 강릉시 초당동 123-4|
 * 4.5|
 * 20대, 주차방법: 무료, 주차장소: 전용주차장|
 * /img/001/menu_tofu.jpg|
 * 08:00 ~ 20:00|
 * 매일 아침 직접 만든 고소한 초당두부를 맛볼 수 있는 곳입니다. 몽글몽글한 순두부 전골이 인기 메뉴이며, 자극적이지 않고 담백한 맛이 일품입니다. 정갈한 밑반찬과 함께 건강한 한 끼를 즐기기 좋습니다.|
 * 가족외식 , 아침식사 , 전통맛집 , 포장 가능|
 * 10,000원~20,000원
 */

package com.sist.apply;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Food {
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
