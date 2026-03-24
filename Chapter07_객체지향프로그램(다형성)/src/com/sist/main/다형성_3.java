package com.sist.main;

import java.util.*;

class AA{
	public void display() {
		System.out.println("AA:display Call...");
	}
}
class BB extends AA{
	public void display() {
		System.out.println("BB:display Call...");
	}
}
class CC extends AA{
	public void display() {
		System.out.println("CC:display Call...");
	}
}
class DD extends AA{
	public void display() {
		System.out.println("DD:display Call...");
	}
}

class EE{
	public void display() {
		System.out.println("EE:display Call...");
	}
}

class MM extends EE{
	public void display() {
		System.out.println("MM:display Call...");
	}
}

class Container{
	Map map=new HashMap();
	public Container() {
		map.put(1, new AA());
		map.put(2, new BB());
		map.put(3, new CC());
		map.put(4, new DD());
	}
	public AA getBean(int menu) {
		return (AA)map.get(menu);
	}
}

public class 다형성_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴입력 1, 2, 3, 4");
		int menu = scan.nextInt();
		
		Container c = new Container();
		AA aa=c.getBean(menu);
		aa.display();
		
//		if (menu==1) {
//			AA aa= new AA();
//			aa.display();
//		}
//		else if (menu==2) {
//			BB bb= new BB();
//			bb.display();
//		}
//		else if (menu==3) {
//			CC cc= new CC();
//			cc.display();
//		}
//		else if (menu==4) {
//			DD dd= new DD();
//			dd.display();
//		}
		
		MM mm = new MM();
		mm.display();
		
		EE ee = new EE();
		ee.display();
		
		EE ee1=new MM();
		ee1.display();
		
		MM mm1=(MM)ee1;
		mm1.display();
	}
}
