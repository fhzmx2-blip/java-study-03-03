package com.sist.lambda;

import java.util.*;

public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
//		numbers.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
//		String name = null;
//		System.out.println(name.length());
//		System.out.println("프로그램 종료");
		
		Optional<String> name =Optional.ofNullable(null);
		System.out.println(name.orElse("이름없음"));
		
		Optional<String> userName=Optional.of("홍길동");
		System.out.println(userName);
		userName.ifPresent(n->System.out.println("이름: "+n));
		
		
		Optional<String> opt=Optional.of("Hello");
		Optional<Integer> len=opt.map(s->s.length());
		System.out.println(len.get());
		
		Optional<String> opt2 = Optional.of("Hello");
		Optional<Integer> result = opt2.flatMap(s->Optional.of(s.length()));
		System.out.println(result.get());
		
		Optional<Integer> opt3=Optional.of(10);
		opt3.filter(n->n>5).ifPresent(n->System.out.println("5보다 큼"));
		
		Optional<String> opt4=Optional.ofNullable(null);
		System.out.println(opt4.isPresent());
		System.out.println(opt4.isEmpty());
	}

}
