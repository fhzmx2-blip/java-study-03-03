/*
 * extend는 클래스 확장해서 사용하는 것
 */

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Sawon{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private String loc;
	private long pay;
	private String hiredate;
	public int getSabun() {
		return sabun;
	}
//	public void setSabun(int sabun) {
//		this.sabun = sabun;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDept() {
//		return dept;
//	}
//	public void setDept(String dept) {
//		this.dept = dept;
//	}
//	public String getJob() {
//		return job;
//	}
//	public void setJob(String job) {
//		this.job = job;
//	}
//	public String getLoc() {
//		return loc;
//	}
//	public void setLoc(String loc) {
//		this.loc = loc;
//	}
//	public long getPay() {
//		return pay;
//	}
//	public void setPay(long pay) {
//		this.pay = pay;
//	}
//	public String getHiredate() {
//		return hiredate;
//	}
//	public void setHiredate(String hiredate) {
//		this.hiredate = hiredate;
//	}
	
}


public class 객체지향프로그램_개념 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa1=new Sawon();
		Sawon sa2=new Sawon();
		Sawon sa3=new Sawon();
		System.out.println(sa1);
		System.out.println(sa2);
		System.out.println(sa3);
		
		
	}

}
