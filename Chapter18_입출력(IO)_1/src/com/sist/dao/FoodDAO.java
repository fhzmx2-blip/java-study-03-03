package com.sist.dao;

import java.io.*;
import java.util.*;
import com.sist.vo.FoodVO;
import lombok.Getter;

@Getter
public class FoodDAO {
	private static List<FoodVO> fList = new ArrayList<FoodVO>();
	static {
		try {
			FileReader fr = new FileReader("c:\\javaDev\\food.txt");
			StringBuffer sb = new StringBuffer();
			int i = 0;
			while ((i = fr.read()) != -1) {
				sb.append((char) i);
			}
			fr.close();
			String[] datas = sb.toString().split("\n");
			for (String food : datas) {
				FoodVO f = new FoodVO();
				StringTokenizer st = new StringTokenizer(food, "|");
				f.setNo(Integer.parseInt(st.nextToken()));
				f.setName(st.nextToken());
				f.setType(st.nextToken());
				f.setPhone(st.nextToken());
				f.setAddress(st.nextToken());
				f.setScore(Double.parseDouble(st.nextToken()));
				f.setParking(st.nextToken());
				f.setPoster(st.nextToken());
				f.setTime(st.nextToken());
				f.setContent(st.nextToken());
				f.setTheme(st.nextToken());
				f.setPrice(st.nextToken());

				fList.add(f);
			}
		} catch (Exception ex) {}
	}

	public static List<FoodVO> getfList() {
		return fList;
	}

	public static void setfList(List<FoodVO> fList) {
		FoodDAO.fList = fList;
	}
}
