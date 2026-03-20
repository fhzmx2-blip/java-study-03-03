/*
 *  static 메소드 => 한 개의 메모리 안에 저장해서 값을 공유
 *  instance 메소드 => 각각의 메모리 안에 저장해서 개별 값 저장 가능
 *  함수 함 = new 함수(); 이게 인스턴스
 *  스태틱은 메서드 자체에, 인스턴스는 힙Heap에
 *  
 *  void는 리턴형이 맞음. 리턴값이 없을 뿐
 *  
 *  프로그램
 *  1. 기능 설정 : 메소드
 *  
 *  2. 화면ui => 변수초기화
 *  
 *  3. 구현
 *  메소드
 */

package com.sist.oop;

class Sawon{
	private int sabun;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
	private String name;
	String dept;
	protected String job;
	public String loc;
	private long pay;
}

public class 접근지정어_1 {
	int a=10;
	int b=20;
	void display(int a) {
		this.a = a;
		b = a;
		//this를 붙이는 것과 아닌 것의 차이에 주목
	}
	public static void main(String[] args) {
		Sawon hong = new Sawon();
		hong.dept="개발부";
		hong.job="사원";
		hong.loc="제주";
		// => 메소드를 이용해서 접근
		hong.setSabun(1);
		hong.setName("홍길동");
		hong.setPay(3000);
		
		System.out.println("이름: "+hong.getName());
		System.out.println("사번: "+hong.getSabun());
		System.out.println("연봉: "+hong.getPay());
		System.out.println("부서: "+hong.getDept());
		System.out.println("직위: "+hong.getJob());
		System.out.println("근무지: "+hong.getLoc());
		
	}
}
