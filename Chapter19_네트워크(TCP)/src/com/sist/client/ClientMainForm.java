package com.sist.client;

import java.awt.*;

import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

import com.sist.commons.Function;

public class ClientMainForm extends JFrame implements ActionListener, Runnable {
	JTextArea ta;
	JTextField tf;
	JTable table;
	DefaultTableModel model;
	JButton b1, b2, b3;
	LoginForm login = new LoginForm();

	Socket s;

	OutputStream out;
	BufferedReader in;

	public ClientMainForm() {
		ta = new JTextArea();
		JScrollPane js1 = new JScrollPane(ta);
		ta.setEditable(false);

		tf = new JTextField();
		b1 = new JButton("쪽지보내기");
		b2 = new JButton("정보 보기");
		b3 = new JButton("나가기");

		String[] col = { "아이디", "이름", "성별" };
		String[][] row = new String[0][3];
		model = new DefaultTableModel(row, col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}

		};
		table = new JTable(model);
		JScrollPane js2 = new JScrollPane(table);

		setLayout(null);
		js1.setBounds(10, 15, 500, 450);
		tf.setBounds(10, 470, 500, 30);

		js2.setBounds(515, 15, 250, 300);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 1, 5, 5));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.setBounds(515, 320, 250, 130);

		add(js1);
		add(tf);
		add(js2);
		add(p);

		setSize(790, 550);
		// setVisible(true);

		login.b1.addActionListener(this);
		login.b2.addActionListener(this);

		tf.addActionListener(this);
		b3.addActionListener(this);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception ex) {
		}
		new ClientMainForm();
	}

	public void connect(String id, String name, String sex) {
		try {
			s = new Socket("192.168.0.40", 7777);

//			 s=new Socket("localhost",7777);
			out = s.getOutputStream();
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out.write((Function.LOGIN + "|" + id + "|" + name + "|" + sex + "\n").getBytes());
		} catch (Exception ex) {
		}
		new Thread(this).start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login.b2) {
			dispose();
			System.exit(0);
		} else if (e.getSource() == login.b1) {
			String id = login.tf1.getText();
			if (id.trim().length() < 1) {
				login.tf1.requestFocus();
				return;
			}
			String name = login.tf2.getText();
			if (name.trim().length() < 1) {
				login.tf2.requestFocus();
				return;
			}
			String sex = "";
			if (login.rb1.isSelected()) {
				sex = "남자";
			} else {
				sex = "여자";
			}
			connect(id, name, sex);
		} else if (e.getSource() == tf) {
			String msg = tf.getText();
			if (msg.trim().length() < 1) {
				tf.requestFocus();
				return;
			}
			try {
				out.write((Function.CHAT + "|" + msg + "\n").getBytes());
			} catch (Exception ex) {
			}
			
		}
		else if(e.getSource()==b3) {
			try {
				out.write((Function.EXIT+"|\n").getBytes());
			} catch (Exception ex) {	}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				String msg = in.readLine();
				StringTokenizer st = new StringTokenizer(msg, "|");
				int protocol = Integer.parseInt(st.nextToken());

				switch (protocol) {
				case Function.LOGIN -> {
					String[] data = { st.nextToken(), st.nextToken(), st.nextToken() };
					model.addRow(data);
				}
				case Function.MYLOG -> {
					String name = st.nextToken();  
					login.setVisible(false);
					setVisible(true);
					setTitle(name);
				}
				case Function.CHAT -> {
					ta.append(st.nextToken() + "\n");
				}
				case Function.MYEXIT ->{
					dispose();
					System.exit(0);
				}
				case Function.EXIT ->{
					String mid = st.nextToken();
					for(int i=0;i<model.getRowCount();i++) {
						String id=model.getValueAt(i, 0).toString();
						if (mid.equals(id)) {
							model.removeRow(i);
							  break;
						}
					}
				}
				
				}
			}
		} catch (Exception ex) {
		}
	}

}