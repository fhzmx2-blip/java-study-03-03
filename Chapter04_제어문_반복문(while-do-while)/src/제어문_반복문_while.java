/*
 * do{
 * 실행문장
 * 증가값
 * }while(끝값);
 */

import java.io.*;

public class 제어문_반복문_while {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		File file = new File("c:\\JavaDev\\movie.txt");
//		FileReader fr = new FileReader(file);
//		StringBuffer db = new StringBuffer();
//		int i=0;
//		while((i=fr.read())!=-1) {
//			db.append((char)i);
//		}
//		fr.close();
//		System.out.println(db.toString());
		
		System.out.println("========for문========");
		for (char c='A'; c<='Z';c++) {
			System.out.println(c+" ");
		}
		
		System.out.println("=========while===========");
		char c='A';
		while(c<='Z') {
			System.out.println(c+" ");
			c++;
		}
		
		System.out.println("==========do~while===========");
		c='A';
		do {
			System.out.println(c+" ");
			c++;
		}while(c<='Z');
	}

}
