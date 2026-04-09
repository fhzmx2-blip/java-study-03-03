package com.sist.files;

import java.nio.file.*;

public class Files_1 {
	public static void main(String[] args) {
		try {
			Path file = Paths.get("C:\\javaDev\\고객.txt");
			System.out.println(file.toAbsolutePath());
			System.out.println(file.getFileName());
			System.out.println(file.getParent());
			System.out.println(file.getRoot());
			long size=Files.size(file);
			System.out.println(size);
			Path dir = Paths.get("C:\\javaDev");
			Files.list(dir).forEach(p->System.out.println(p.getFileName()));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
