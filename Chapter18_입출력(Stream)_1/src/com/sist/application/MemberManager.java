package com.sist.application;

import java.io.*;
import java.util.*;

public class MemberManager {
	private final String FILE_NAME = "c:\\java_data\\member.txt";

	public void create(Scanner scan) {
		System.out.print("이름");
		String name = scan.next();
		System.out.print("성별");
		String sex = scan.next();
		System.out.print("주소");
		String address = scan.next();

		String member = name + "|" + sex + "|" + address + "\n";

		try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
			fw.write(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("가입완료");
	}

	public List<MemberVO> read() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		FileReader fr = null;
		try {
			fr = new FileReader(FILE_NAME);
			String data = "";
			int i = 0;
			while ((i = fr.read()) != -1) {
				data += (char) i;
			}
			String[] datas = data.split("\n");
			for (String m : datas) {
				StringTokenizer st = new StringTokenizer(m, "|");
				MemberVO vo = new MemberVO();
				vo.setName(st.nextToken());
				vo.setSex(st.nextToken());
				vo.setAddress(st.nextToken());
				
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {

			}
		}
		return list;
	}

	public void delete(int no) {
		FileWriter fw = null;
		try {
			List<MemberVO> list = read();
			list.remove(no - 1);
			String data = "";
			for (MemberVO vo : list) {
				data += vo.getName() + "|" + vo.getSex() + "|" + vo.getAddress() + "\n";
			}
			fw = new FileWriter(FILE_NAME);
			fw.write(data);
			System.out.println("회원 탈퇴 완료");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception ex) {
			}
		}
	}

	public void update(MemberVO mvo, int no) {
		FileWriter fw = null;
		try {
			List<MemberVO> list = read();
			list.set(no - 1, mvo);

			String data = "";
			for (MemberVO vo : list) {
				data += vo.getName() + "|" + vo.getSex() + "|" + vo.getAddress() + "\n";
			}
			fw = new FileWriter(FILE_NAME);
			fw.write(data);
			System.out.println("회원 수정 완료");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception ex) {
			}
		}
	}
}
