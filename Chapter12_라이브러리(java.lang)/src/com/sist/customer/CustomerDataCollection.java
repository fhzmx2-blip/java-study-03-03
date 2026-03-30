package com.sist.customer;

import java.io.FileReader;
import java.util.Scanner;

public class CustomerDataCollection {
	public static CustomerVO[] customers=new CustomerVO[100];
	static {
		try {
			FileReader in=new FileReader("c:\\javaDev\\고객.txt");
			String data="";
			int i=0;
			while ((i = in.read()) != -1) {
	            data += (char)i;
	        }
			in.close();
//			System.out.println(data);
			String[]  datas=data.split("\n");
			int j=0;
			for(String s:datas) {
				String[] cust=s.split(",");
				CustomerVO vo = new CustomerVO();
				vo.setCustomer_id(cust[0]);
				vo.setLogin_id(cust[1]);
				vo.setPwd(cust[2]);
				vo.setName(cust[3]);
				vo.setEmail(cust[4]);
				vo.setPhone(cust[5]);
				vo.setLoc(cust[6]);
				vo.setRegdate(cust[7]);
				vo.setGrade(cust[8]);
				customers[j]=vo;
				j++;
			}
		}catch (Exception ex) {}
	}
	
	public String isLogin(String id, String pwd) {
		String result="";
		int count=0;
		for(CustomerVO vo:customers) {
			if(vo.getLogin_id().equals(id)) {
				count=1;
				break;
			}
		}
		if(count==0) {
			result="NOID";
		}
		else {
			count=0;
			String name="";
			login:
			for(CustomerVO vo:customers) {
				if(vo.getLogin_id().equals(id)) {
					if(vo.getPwd().equals(pwd)) {
						count=1;
						name=vo.getName();
						break login;
					}
				}
			}
			if (count==0) {
				result="NOPWD";
			}
			else {
				result="OK|"+name;
			}
		}
		return result;
	
	}
	
	public int cusomterTotalPage() {
		return (int)(Math.ceil(customers.length/10.0));
	}
	public CustomerVO[] customerListData(int page) {
		int totalpage=cusomterTotalPage();
		int row=10;
		if(totalpage==page && customers.length%10>0) {
			row=customers.length%10;
		}
//		System.out.println("row="+row);
		CustomerVO[] cust=new CustomerVO[row];
		
		int j=0;
		int pagecnt=(page*row)-row;
		for(int i=0;i<customers.length;i++) {
			if(j<10 && i>=pagecnt) {
				cust[j]=customers[i];
				j++;
			}
		}
		
		return cust;
	}
	
		
	
}
