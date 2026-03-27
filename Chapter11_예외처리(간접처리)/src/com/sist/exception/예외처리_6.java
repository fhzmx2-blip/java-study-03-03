package com.sist.exception;

import java.io.FileReader;
import java.io.IOException;

public class 예외처리_6 {
	public static void main(String[] args) {
		String image=null;
		try {
			System.out.println(image.length());
			System.out.println("Image를 브라우저에 출력");
		}catch(NullPointerException e) {
			System.out.println("이미지 없음을 보냄");
		}
		//1페이지가  null이라는 점을 생각해보자
		
	}
}
