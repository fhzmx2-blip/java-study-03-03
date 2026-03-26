package com.sist.inter;

import java.util.Random;
import java.util.Scanner;
interface Game{
	public void start();
}

class MoleGame implements Game{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int score=0;
		System.out.println("두더쥐 게임");
		
		
		
		}
	
}

class SpeedGame implements Game{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("순발력 게임");
		System.out.println("지금!!이 뜨면 Enter");
		try {
			System.out.println("\n 준비...");
			Thread.sleep(rand.nextLong(3000)+2000);
		}catch(Exception ex) {}
		long startTime=System.currentTimeMillis();
		System.out.println("지금!!");
		scan.nextLine();
		long endTime=System.currentTimeMillis();
		
		long time=endTime-startTime;
		if(time<100) {
			System.out.println("반칙. 너무 빠름");
		}
		else if(time<300) {
			System.out.println("빠름:["+time+"]");
		}
		else if(time<700 ) {
			System.out.println("보통:["+time+"]");
		}
		else {
			System.out.println("느림:["+time+"]");
		}
	}
	
}

public class 인터페이스_응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Game game = null;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("게임선택 1, 2");
//		int menu = scan.nextInt();
//		if (menu==1) {
//			game=new MoleGame();
//			game.start();
//		}
//		else if (menu==2) {
//			game=new SpeedGame();
//			game.start();
//		}
//		MoleGame mole = new MoleGame();
//		SpeedGame speed = new SpeedGame();
//		
//		if(mole instanceof Game) {
//			System.out.println("mole<game");
//		}
//		else{
//			System.out.println("mole>game");
//		}
//		
//		if (speed instanceof Game) {
//			System.out.println("speed<game");
//		}
//		else {
//			System.out.println("speed>game");
//		}
		
		Object obj=new Object();
		String str=new String();
		StringBuffer sb=new StringBuffer();
		
		if(str instanceof Object) {
			System.out.println("str<object");
		}
		
		if(obj instanceof Object) {
			System.out.println("str<object");
		}
	}

}
