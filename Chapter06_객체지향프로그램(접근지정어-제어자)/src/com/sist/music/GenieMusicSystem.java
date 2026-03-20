package com.sist.music;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 * 1. 패키지 만드는 방법
 * 2. 패키지에 있는 클래스 가지고 오기
 * 3. 접근지정어
 * 4. 제어어
 */

public class GenieMusicSystem {
	public static Music[] music=new Music[50];
	// 초기화 => static이니까 객체 생성없이 초기화하겠다는 얘기
	static {
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			Elements artist=doc.select("table.list-wrap a.artist");
			Elements album=doc.select("table.list-wrap a.albumtitle");
//			System.out.println(title);
			Elements etc=doc.select("table.list-wrap span.rank");
			
			for(int i=0;i<title.size();i++) {
				Music m = new Music();
				m.setNo(i+1);
				m.setTitle(title.get(i).text());
				m.setSinger(artist.get(i).text());
				m.setAlbum(album.get(i).text());
				
				System.out.println(i+1);
				System.out.println(title.get(i).text());
				System.out.println(artist.get(i).text());
				System.out.println(album.get(i).text());
//				System.out.println(etc.get(i).text());
				String temp=etc.get(i).text();
				String state="";
				String id="";
				if(temp.equals("유지")) {
					state="유지";
					id="0";
				}
				else {
					state=temp.replaceAll("[^가=힣]", "");
					id=temp.replaceAll("[^0-9]", "");
				}
				
				m.setState(state);
				m.setIdcremnent(Integer.parseInt(id));
				music[i]=m;
				System.out.println("상태: "+state);
				System.out.println("등폭: "+id);				
				System.out.println("======================");
			}
		}catch(Exception ex) {}
	}
	
	public int menu() {
		System.out.println("=====메뉴=====");
		
		System.out.println("1. 음악 목록");
		System.out.println("2. 상세 보기");
		System.out.println("3. 곡명 찾기");
		System.out.println("4. 가수 찾기");
		System.out.println("5. 종료");
		System.out.println("=============");
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴 선택: ");
		int m=scan.nextInt();
		return m;
	}
	
	public void musicList(){
		for(Music m:music) {
			System.out.println(m.getNo()+"."+m.getTitle());
		}
	}
	
	public void musicDetail(int no) {
		for(Music m:music) {
			if(m.getNo()==no) {
				System.out.println("순위: "+m.getNo());
				System.out.println("곡명: "+m.getTitle());
				System.out.println("앨범: "+m.getAlbum());
				System.out.println("상태: "+m.getState());
				String s=m.getState();
				if (s.equals("유지")) {
					System.out.println("등폭:-");
				}
				else if (s.equals("상승")) {
					System.out.println("등폭: ▲");
				}
				else if (s.equals("하강")) {
					System.out.println("등폭: ▼");
				}
				
			}
		}
	}
	
	public void titleFind(String fd) {
		for(Music m:music) {
			if(m.getTitle().contains(fd)) {
				System.out.println(m.getNo()+"."+m.getTitle());
			}
		}
	}
	
	public void artistFind(String fda) {
		for(Music m:music) {
			if(m.getSinger().contains(fda)) {
				System.out.println(m.getNo()+"."+m.getTitle()+"-"+m.getSinger());
			}
		}
	}
	//기능 메소드
	// 목록 출력, 상세보기, 검색(가수, 제목), 동영상
}
