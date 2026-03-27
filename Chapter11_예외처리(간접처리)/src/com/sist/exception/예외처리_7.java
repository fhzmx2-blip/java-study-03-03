/*
 * throw new 어쩌구("저쩌구")
 * 아래에 코딩 불가
 */

package com.sist.exception;

import java.util.Scanner;

public class 예외처리_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		
		try {
			if(num%2!=0) {
				throw new Exception("짝수만 필요합니다");
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
