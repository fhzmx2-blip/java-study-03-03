package com.sist.files;

import java.nio.file.*;
import java.io.*;
import java.util.*;

public class IO_정리 {
	public static void main(String[] args) {
		Path filePath = Paths.get("c:\\javaDev\\고객.txt");
		Path dirPath = Paths.get("c:\\javaDev");
		
		try {
			if(!Files.exists(filePath)) {
				Files.createFile(filePath);
				System.out.println("파일생성완료");
			}
			if(!Files.exists(dirPath)) {
				Files.createDirectories(dirPath);
				System.out.println("디렉토리생성완료");
			}
			
			String content = "어쩌구저쩌구";
			Files.write(filePath, content.getBytes());
			System.out.println("쓰기완료");
			Path custFile=Paths.get("c:\\javaDev\\고객.txt");
			List<String> data=Files.readAllLines(custFile);
			data.stream().forEach(s->System.out.println(s));
			
			Path copyPath=Paths.get("c:\\javaDev\\고객2.txt");
			Files.copy(custFile, copyPath, StandardCopyOption.REPLACE_EXISTING);
			
			Path movePath = Paths.get("c:\\javaDev2\\고객3.txt");
			Files.move(copyPath, movePath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("이동완료");
			
			Path delDir=Paths.get("c:\\javaDev2");
			Files.delete(copyPath);
			Files.delete(movePath);
			Files.delete(delDir);
			System.out.println("디렉토리 삭제");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
