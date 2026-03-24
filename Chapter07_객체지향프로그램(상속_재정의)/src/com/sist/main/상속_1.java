/*
 * 상속, 기능을 그냥 사용하는 것 => 마음에 안들 경우 변경 가능
 */

package com.sist.main;



import javax.swing.JFrame;

public class 상속_1 {
	JFrame f=new JFrame();
	public 상속_1() {
		f.setSize(800, 600);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new 상속_1();
	}

}
