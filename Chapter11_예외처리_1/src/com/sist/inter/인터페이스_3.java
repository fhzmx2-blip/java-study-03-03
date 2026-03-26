package com.sist.inter;

import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

// A와 D를 보면 메소드명 충돌. 실행에 오류는 안나는데 D가 나오진 않겠지... 
interface A{
	public void aaa();
}

interface B{
	public void bbb();
}
interface D{
	public void aaa();
}


class C implements A, B, D{

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("bbb() Call...");
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("aaa() Call...");
	}
	
}

public class 인터페이스_3  {

}
