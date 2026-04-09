package com.sist.thread;

class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(this.getName()+":"+i);
			try {
				Thread.sleep(1000);
			}catch (Exception ex) {	}
		}
	}

}

public class Thread_1 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.setName("말");
		t2.setName("소");
		t3.setName("돼지");
		
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
