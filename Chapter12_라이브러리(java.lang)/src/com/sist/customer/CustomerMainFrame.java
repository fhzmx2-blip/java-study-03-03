package com.sist.customer;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CustomerMainFrame extends JFrame implements ActionListener {
	
	CardLayout card = new CardLayout();
	Login login = new Login();
	CustomerDataCollection cdc= new CustomerDataCollection();
	CustomerList cList = new CustomerList();
	CustomerFind cFind = new CustomerFind();
	JMenuItem list = new JMenuItem("사원목록");
	JMenuItem find = new JMenuItem("사원검색");
	JMenuItem exit = new JMenuItem("종료");
		
	
	public CustomerMainFrame() {
		JMenu menu = new JMenu("메뉴");
		menu.add(list);
		menu.add(find);
		menu.addSeparator();
		menu.add(exit);
		JMenuBar bar = new JMenuBar();
		bar.add(menu);
		setJMenuBar(bar);
		
		
		setLayout(card);
		add("cList",cList);
		add("cFind",cFind);
		setSize(950, 700);
//		setVisible(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		list.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
	}
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}catch(Exception ex) {}
		new CustomerMainFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2) {
			JOptionPane.showMessageDialog(this, "프로그램을 종료합니다");
			System.exit(0);
		}
		else if(e.getSource()==login.b1) {
			String id=login.tf.getText();
			if (id.trim().length()<1) {
				JOptionPane.showMessageDialog(this, "id를 입력하세요");
				login.tf.requestFocus();
				return;
			}
			
			String pwd=String.valueOf(login.pf.getPassword());
			
//			String pwd=login.pf.getPassword().toString();
			if (pwd.trim().length()<1) {
				JOptionPane.showMessageDialog(this, "pwd를 입력하세요");
				login.tf.requestFocus();
				return;
			}
			
			String res=cdc.isLogin(id, pwd);
			if(res.equals("NOID")) {
				JOptionPane.showMessageDialog(this, "id 없음");
				login.tf.setText("");
				login.pf.setText("");
				login.tf.requestFocus();
			}
			else if(res.equals("NOPWD")) {
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
				
				login.pf.setText("");
				login.pf.requestFocus();
			}
			else {
				login.setVisible(false);
				String name=res.substring(res.indexOf("|")+1);
				setTitle(name+"님이 로그인되었습니다");
				setVisible(true);
			}
		}
		else if (e.getSource()==list) {
			card.show(getContentPane(), "cList");
		}
		else if (e.getSource()==find) {
			card.show(getContentPane(), "cFind");
		}
		else if (e.getSource()==exit) {
			dispose();
			System.exit(0);
		}
		
		
	}
}
