package com.sist.ui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.sist.application.BoardSystem;

public class BoardMain extends JFrame implements ActionListener{
	private int curPage = 1;
	private int totalpage=0;
	BoardSystem bs = new BoardSystem();
	CardLayout card = new CardLayout();
	BoardList bList = new BoardList();
	BoardInsert bInsert = new BoardInsert();
	
	
	public BoardMain() {
		setLayout(card);
		add("list",bList);
		add("insert", bInsert);
		setSize(640,540);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		bList.inBtn.addActionListener(this);
		bInsert.b2.addActionListener(this);
	}
	
	public void getBoardData() {
		
	}
	
	public static void main(String[] args) {
		new BoardMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bList.inBtn) {
			card.show(getContentPane(), "insert");
		}
		else if(e.getSource()==bInsert.b2) {
			card.show(getContentPane(), "list");
		}
	}
	
}
