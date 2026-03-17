/*
 * 메소드
 * 1. 메뉴
 * 탑 200 목록 출력
 * 유튜브 연결로 동영상 실행 상세보기
 * 2. 데이터 읽기
 */

import java.util.*;

public class 메소드_분리_2 {

	static void menu() {
		System.out.println("=====메뉴=====");
		System.out.println("1. 뮤직 목록");
		System.out.println("2. 뮤직 가수명");
		System.out.println("3. 뮤직 앨범");
		System.out.println("4. 뮤직 상세보기");
		System.out.println("5. 종료");
		System.out.println("============");
	}
	
	static void process() throws Exception {
		Scanner scan = new Scanner(System.in);
		while (true) {
			menu();
			System.out.print("메뉴 선택: ");
			int m = scan.nextInt();
			
			if (m==5) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(m==1) {
				String[] title=GenieMusic.getTitle();
				for(int i = 0; i<title.length;i++) {
					System.out.println((i+1)+". "+title[i]);
				}
			}
			else if(m==2) {
				String[] Musician=GenieMusic.getMusician();
				for(int i = 0; i<Musician.length;i++) {
					System.out.println((i+1)+". "+Musician[i]);
				}
			}
			
			else if(m==3) {
				String[] album=GenieMusic.getAlbum();
				for(int i = 0; i<album.length;i++) {
					System.out.println((i+1)+". "+album[i]);
				}
			}
			
			else if(m==4) {
				System.out.print("검색어: ");
				String fd=scan.next();
				String[] title=GenieMusic.getFind(fd);
				System.out.println("검색 결과 "+title.length+"건");
				for (int i=0;i<title.length;i++) {
					System.out.println((i+1)+". "+title[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		process();
	}

}
