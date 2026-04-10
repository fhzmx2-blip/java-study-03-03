package com.sist.client;

import java.net.Socket;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s = new Socket("192.168.0.40", 7777);
//		Socket s = new Socket("localhost", 7777);
	}

}
