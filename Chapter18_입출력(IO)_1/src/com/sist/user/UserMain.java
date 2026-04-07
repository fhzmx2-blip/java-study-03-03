package com.sist.user;

import java.util.*;
import com.sist.service.*;
import com.sist.vo.FoodVO;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		FoodService fService = new FoodService();
		while (true) {
			System.out.println("1. 목록");
			System.out.println("2. 상세보기");
			System.out.println("3. 음식검색");
			System.out.println("4. 주소검색");
			System.out.println("5. 종료");
			System.out.println();
			System.out.print("메뉴선택: ");
			int menu = scan.nextInt();
			switch (menu) {
			case 1 -> {
				System.out.print("페이지 입력");
				int page = scan.nextInt();
				List<Optional<FoodVO>> fList = fService.food_list(page);

				List<FoodVO> foods = fList.stream().flatMap(Optional::stream).toList();

				if (foods.isEmpty()) {
					System.out.println("데이터 없음");
				} else {
					foods.forEach(f -> System.err.println(f.getNo() + "." + f.getName()));
				}
			}
			case 2 -> {
				System.out.print("상세볼 맛집 번호:");
				int no = scan.nextInt();
				FoodVO vo = fService.food_detail(no);
				System.out.println(vo);
			}
			case 3 -> {
				System.out.print("한식, 중식, 양식, 일식, 분식:");
				String type = scan.next();
				List<FoodVO> list = fService.food_type_find(type);
				list.stream().forEach(food -> System.out.println(food.getName() + "(" + food.getType() + ")"));
			}
			case 4 -> {
				System.out.print("주소 입력:");
				String type = scan.next();
				List<FoodVO> list = fService.food_address_find(type);
				list.stream().forEach(food -> System.out.println(food.getName() + "(" + food.getAddress() + ")"));
			}
			case 5 -> {
				System.out.println("프로그램 종료");
				System.exit(0);
			}

			default -> System.out.println("메뉴가 없습니다");

			}
		}
	}

}
