package com.sist.manager;

public class GenieMusicManager {
	public static Music[] musics=new Music[100];
	
	public void init() {
		
	}
	
	public Music[] musicAllData() {
		return musics;
	}
	
	public Music MusicDetail(int mno) {
		Music m=new Music();
		for(Music mm:musics) {
			if(mm.getMno()==mno) {
				m=mm;
				break;
			}
		}
		return m;
	}
	
	public Music[] musicFind(String type, String fd) {
		return musics;
	}
	
	public String musicKey(String title) {
		String key="";
		return key;
	}
}
