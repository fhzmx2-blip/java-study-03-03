package com.sist.music;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		GenieMusicSystem gm = new GenieMusicSystem();
		while (true) {
			int m=gm.menu();
			if(m==5) {
				System.out.println("뮤직시스템 종료");
				break;
			}
			else if (m==1) {
				gm.musicList();
			}
			else if (m==2) {
				Scanner scan = new Scanner(System.in);
				System.out.println("번호 입력: ");
				int no=scan.nextInt();
				gm.musicDetail(no);
			}
			else if (m==3) {
				Scanner scan = new Scanner(System.in);
				System.out.println("제목 입력: ");
				String fd=scan.next();
				gm.titleFind(fd);
			}
			else if (m==4) {
				Scanner scan = new Scanner(System.in);
				System.out.println("뮤지션 입력: ");
				String fda=scan.next();
				gm.artistFind(fda);
			}
		}
	}
	
}
