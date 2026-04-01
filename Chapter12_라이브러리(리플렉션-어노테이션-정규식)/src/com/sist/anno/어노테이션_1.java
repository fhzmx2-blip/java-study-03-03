package com.sist.anno;

import java.lang.reflect.Method;
import java.util.Scanner;

class Controller {
	@RequestMapping("1")
	public void main_page() {
		System.out.println("Main Page 이동");
	}

	@RequestMapping("2")
	public void member_join() {
		System.out.println("회원가입 이동");
	}

	@RequestMapping("3")
	public void login() {
		System.out.println("로그인 이동");
	}

	@RequestMapping("4")
	public void board_list() {
		System.out.println("게시판으로 이동");
	}

	@RequestMapping("5")
	public void food_list() {
		System.out.println("맛집목록 이동");
	}

	@RequestMapping("6")
	public void food_detail() {
		System.out.println("맛집 상세보기 이동");
	}

	@RequestMapping("7")
	public void food_like() {
		System.out.println("맛집 찜하기");
	}
}

public class 어노테이션_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~n 선택");
		int menu = scan.nextInt();
		Controller c = new Controller();

//		if (menu == 1) {
//		    c.main_page();
//		} else if (menu == 2) {
//		    c.member_join();
//		} else if (menu == 3) {
//		    c.login();
//		} else if (menu == 4) {
//		    c.board_list();
//		} else if (menu == 5) {
//		    c.food_list();
//		} else if (menu == 6) {
//		    c.food_detail();
//		} else {
//		    System.out.println("잘못된 선택입니다.");
//		}
//		
//		switch(menu) {
//	    case 1 -> c.main_page();
//	    case 2 -> c.member_join();
//	    case 3 -> c.login();
//	    case 4 -> c.board_list();
//	    case 5 -> c.food_list();
//	    case 6 -> c.food_detail();
//	    default -> System.out.println("잘못된 선택입니다.");

		try {
			Class clsName = Class.forName("com.sist.anno.Controller");
			Object obj = clsName.getDeclaredConstructor().newInstance();

			Method[] methods = clsName.getDeclaredMethods();

			for (Method m : methods) {
				RequestMapping rm = m.getAnnotation(RequestMapping.class);
				if (rm.value().equals(String.valueOf(menu))) {
					m.invoke(obj, null);
				}
			}
		} catch (Exception ex) {
		}
	}

}
