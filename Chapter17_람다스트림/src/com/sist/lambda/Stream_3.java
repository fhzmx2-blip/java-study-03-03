package com.sist.lambda;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class User{
	private String name;
	private int age;
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Order{
	private String userName;
	private int price;
}
public class Stream_3 {
	public static void main(String[] args) {
		List<User> users = Arrays.asList(
				new User("홍길동", 25),
				new User("이순신", 17),
				new User("박문수", 30),
				new User("김두한", 27),
				new User("강감찬", 22)
				);
		List<Order> orders = Arrays.asList(
				new Order("홍길동", 20000),
				new Order("이순신", 25000),
				new Order("박문수", 30000),
				new Order("김두한", 55000),
				new Order("강감찬", 15000),
				new Order("홍길동", 22000),
				new Order("이순신", 25200),
				new Order("박문수", 30300),
				new Order("홍길동", 26000),
				new Order("이순신", 26000),
				new Order("박문수", 63000)
				);
		
		System.out.println("========");
		List<User> adults=users.stream().filter(u->u.getAge()>=18).collect(Collectors.toList());
		adults.stream().forEach(u->System.out.println(u.getName()+"("+u.getAge()+")"));
		
		System.out.println();
		List<String> names=users.stream().map(User::getName).collect(Collectors.toList());
		names.stream().forEach(System.out::println);
		
		List<Order> kim=orders.stream().filter(o->o.getUserName().equals("김두한")).collect(Collectors.toList());
		kim.stream().forEach(k->System.out.println(k.getUserName()+"("+k.getPrice()+")"));
		
		int total= orders.stream().map(Order::getPrice).reduce(0,Integer::sum);
		DecimalFormat df =new DecimalFormat("#,###,###,###");
		System.out.println("총금액: "+df.format(total)+"원");
		
		int hong=0, kim2=0, lee=0, kang=0, park=0;
		for(Order o:orders) {
			if(o.getUserName().equals("홍길동")) {
				hong+=o.getPrice();
			}
			if(o.getUserName().equals("김두한")) {
				kim2+=o.getPrice();
			}
			if(o.getUserName().equals("이순신")) {
				lee+=o.getPrice();
			}
			if(o.getUserName().equals("강감찬")) {
				kang+=o.getPrice();
			}
			if(o.getUserName().equals("박문수")) {
				park+=o.getPrice();
			}
		}
		
		System.out.println("홍길동->"+hong);
		System.out.println("김두한->"+kim2);
		System.out.println("이순신->"+lee);
		System.out.println("강감찬->"+kang);
		System.out.println("박문수->"+park);
		
		System.out.println();
		Map<String,Integer> result = 
				orders.stream().collect(Collectors.groupingBy(Order::getUserName,
						Collectors.summingInt(Order::getPrice)) 
						);
		Set<String> set = result.keySet();
		for(String s:set) {
			System.out.println(s+"->"+result.get(s));
		}
		
		
		
	}
}
