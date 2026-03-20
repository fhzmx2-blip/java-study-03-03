package com.sist.oop2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Temp{
	public void sum(int... value) {
		int s=0;
		for(int i=0;i<value.length;i++) {
			s+=value[i];
		}
		System.out.println("sum="+s);
	}
	public String change(int num) {
		DecimalFormat d=new DecimalFormat("###,###,###");
		return d.format(num);
	}
	public String dateChange(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
	}
}

public class 메소드_1 {
	public static void main(String[] args) {
		Temp t = new Temp();
		t.sum(1, 2, 3, 4, 5, 6, 7);
		t.sum(100,200);
		int a=100000000;
		String res=t.change(a);
		System.out.println(res);
		System.out.println(new Date());
//		Date date = new Date();
		res=t.dateChange(new Date());
		System.out.println(res);
		
	}
}
