/*
 *	indexOf / lastIndexOf
 *	앞에서 찾기 / 뒤에서 찾기 
 */

import java.io.*;

public class String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File dir = new File("c:\\javaDev");
//		File[] files=dir.listFiles();
//		for (File f:files) {
//			if(f.isFile()) {
//			String name=f.getName();
//			String ext=name.substring(name.lastIndexOf(".")+1);
//			System.out.println(ext);
//			}
//		}
		
		String msg="Hello Java!!";
		System.out.println("a의 위치: "+msg.indexOf("a"));
		System.out.println("a의 위치: "+msg.lastIndexOf("a"));
		System.out.println("b의 위치: "+msg.indexOf("b"));
		System.out.println("b의 위치: "+msg.lastIndexOf("b"));
		
	}

}
