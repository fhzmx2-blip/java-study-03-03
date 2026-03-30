package com.sist.customer;

import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {
	JLabel la1, la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	
	public Login() {
		setLayout(null);
		la1=new JLabel("아이디");
		la2=new JLabel("비밀번호");
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
		la1.setBounds(10, 15, 80, 30);
		tf.setBounds(95,15,150,30);
		
		la2.setBounds(10, 50, 80, 30);
		pf.setBounds(95,50,150,30);
		
		add(la1);add(tf);
		add(la2);add(pf);
		
		JPanel p = new JPanel();
		p.add(b1);p.add(b2);
		p.setBounds(10, 90, 235, 35);
		add(p);
		
		setBounds(400, 270, 265, 175);
//		setSize(265,180);
		setVisible(true);
	}
	
	
}
