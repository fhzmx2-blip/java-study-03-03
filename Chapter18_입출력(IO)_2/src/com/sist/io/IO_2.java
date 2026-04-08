package com.sist.io;

import java.util.*;
import java.io.*;

public class IO_2 {
	public static void main(String[] args) {
		try {
			File dir = new File("c:\\javaDev");
			File[] list = dir.listFiles();
			for(File f:list) {
				if(f.isFile()){
					String len=f.length()/1024>0?(f.length()/1024)+"KB":f.length()+"Byte";
					System.out.println(f.getName()+" "+len);
				} else {
				System.out.println(f.getName()+" DIR");
			}
			}
		} catch (Exception ex) {	}
	}
}
