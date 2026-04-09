package com.sist.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.*;

public class URL_1 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("검색어 입력:");
			String fd=scan.next();
			System.out.println(URLEncoder.encode(fd,"UTF-8"));
			String u="https://books.toscrape.com/catalogue/category/books_1/index.html"+URLEncoder.encode(fd, "UTF-8");
			URL url = new URL("https://books.toscrape.com/");
			URI uri = new URI("https://books.toscrape.com/");
			url=uri.toURL();
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			if (conn!=null) {
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				while (true) {
					String line=in.readLine();
					if(line==null) break;
					System.out.println(line);
				}
			}
			
			
		} catch (Exception ex) {

		}
	}
}
