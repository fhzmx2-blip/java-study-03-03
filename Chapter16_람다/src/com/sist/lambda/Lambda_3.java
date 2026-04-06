package com.sist.lambda;
//C001,user001,pw001,김민수,minsu.kim1@test.com,010-1000-0001,서울,2023-01-02,VIP

import java.util.*;

import lombok.Getter;
import lombok.Setter;

import java.io.*;

@Getter
@Setter

class Customer {
	private String cno;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String phone;
	private String loc;
	private String regidate;
	private String grade;
}

class CustomerManager {
	public static List<Customer> cList = new ArrayList<Customer>();
	static {
		try {
			FileReader fr=new FileReader("C:\\javaDev\\고객.txt");
			String data="";
			int i=0;
			while((i=fr.read())!=-1) {
				data+=(char)i;
			}
			fr.close();
			String[] datas=data.split("\n");
			for(String cust:datas) {
				StringTokenizer st=new StringTokenizer(cust,",");
				Customer c = new Customer();
				c.setCno(st.nextToken());
				c.setId(st.nextToken());
				c.setPwd(st.nextToken());
				c.setName(st.nextToken());
				c.setEmail(st.nextToken());
				c.setPhone(st.nextToken());
				c.setLoc(st.nextToken());
				c.setRegidate(st.nextToken());
				c.setGrade(st.nextToken());
				
				CustomerManager.cList.add(c);
			}
		} catch (Exception e) {}
	}
}

public class Lambda_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CustomerManager cm = new CustomerManager();
		while (true) {
			System.out.println("===메뉴===");
			System.out.println("1. 전체 목록");
			System.out.println("2. VIP 찾기");
			System.out.println("3. 서울 거주자");
			System.out.println("4. 종료");
			System.out.println("=========");
			int menu = scan.nextInt();
			switch (menu) {
			
			case 1 -> {
//				for(Customer c:cm.cList) {
//					System.out.println(c.getId()+"."+c.getName());
//				}
				cm.cList.forEach(c->System.out.println(c.getId()+"."+c.getName()));
			}
			
			case 2 -> {
//				for(Customer c:cm.cList) {
////					if(c.getGrade().trim().equals("VIP")) {
////					if(c.getGrade().contains("VIP")) {
//					if(c.getGrade().equals("VIP\r")) {
//						System.out.println(c.getName()+"."+c.getGrade());
//					}
//				}
				cm.cList.stream().
				filter(c->c.getGrade().
						contains("VIP")).forEach(c->System.out.println(c.getName()+" "+c.getGrade()));
			}
			
			case 3 -> {
//				for(Customer c:cm.cList) {
////					if(c.getLoc().trim().equals("서울")) {
////					if(c.getLoc().contains("서울")) {
//					if(c.getGrade().equals("서울")) {
//						System.out.println(c.getName()+"."+c.getGrade());
//					}
//				}
				cm.cList.stream().
				filter(c->c.getLoc().
						contains("서울")).forEach(c->System.out.println(c.getName()+" "+c.getLoc()));
			}
			
			case 4 -> {
				System.out.println("종료");
				System.exit(0);
			}
			
			default -> System.out.println("없는 메뉴");
			}
		}
	}
}
