package com.sist.server;

import java.util.*;
import com.sist.commons.Function;
import java.io.*;
import java.net.*;

public class Server implements Runnable {
	private Vector<Client> waitVc = new Vector<Client>();
	private ServerSocket ss;
	private final int PORT = 7777;

	public Server() {
		try {
			ss = new ServerSocket(PORT); // IP는 자동 인식
			System.out.println("Server Start...");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				Socket s = ss.accept();
				System.out.println("접속자의 연결 번호:" + s.getPort());
				System.out.println("IP:" + s.getInetAddress().getHostAddress());
				Client client = new Client(s);
				client.start();
			}
		} catch (Exception ex) {
		}
	}

	class Client extends Thread {
		String id, name, sex;
		Socket s;
		BufferedReader in;
		OutputStream out;

		public Client(Socket s) {
			this.s = s;
			try {
				out = s.getOutputStream();
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			} catch (Exception ex) {
			}
		}

		public void run() {
			try {
				while (true) {
					String msg = in.readLine();
					System.out.println("client 요청:" + msg);
					StringTokenizer st = new StringTokenizer(msg, "|");
					int protocol = Integer.parseInt(st.nextToken());

					switch (protocol) {
					case Function.LOGIN -> {
						id = st.nextToken();
						name = st.nextToken();
						sex = st.nextToken();

						messageAll(Function.CHAT + "|[알림 ⏩] " + name + "님 입장하셨습니다");
						messageAll(Function.LOGIN + "|" + id + "|" + name + "|" + sex);

						messageTo(Function.MYLOG + "|" + name);
						waitVc.add(this);
						for (Client c : waitVc) {
							messageTo(Function.LOGIN + "|" + c.id + "|" + c.name + "|" + c.sex);
						}

					}
					case Function.CHAT -> {
						String data = st.nextToken();
						messageAll(Function.CHAT + "|[" + name + "] " + data);
					}
					case Function.EXIT -> {
						messageAll(Function.EXIT + "|" + id);
						for (int i = 0; i < waitVc.size(); i++) {
							Client c = waitVc.get(i);
							if (c.id.equals(id)) {
								messageTo((Function.MYEXIT) + "|");
								waitVc.remove(i);
								try {
									in.close();
									out.close();
								} catch (Exception e) {

								}
							}
						}
					}

					}
				}
			} catch (Exception ex) {
			}
		}

		public synchronized void messageTo(String msg) {
			try {
				out.write((msg + "\n").getBytes());
			} catch (Exception ex) {
			}
		}

		public synchronized void messageAll(String msg) {
			try {
				for (Client c : waitVc) {
					c.messageTo(msg);
				}
			} catch (Exception ex) {
			}
		}

	}

}