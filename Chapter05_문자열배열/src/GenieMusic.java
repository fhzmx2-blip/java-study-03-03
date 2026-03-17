import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusic {
	//1기능
	//목록읽기, 노래명
	//가수 읽기
	//앨범 읽기
	static String[] getTitle() throws Exception {
		String[] title = new String[200];
		int index = 0;
		for (int i=1;i<=4;i++) {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=14&rtm=Y&pg="+i).get();
			Elements t=doc.select("table.list-wrap a.title");
			for(int j=0;j<t.size();j++) {
				String s=t.get(j).text();
				title[index]=s;
				index++;
			}
		}
		return title;
	}
	
	static String[] getFind(String fd) throws Exception {
		   int count=0;
		   for(int i=1;i<=4;i++)  {
			   Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=14&rtm=Y&pg="+i).get();
			   Elements t=doc.select("table.list-wrap a.title");
			   for(int j=0;j<t.size();j++)  {
				   if(t.get(j).text().contains(fd))  {
					   count++;
				   }
			   }
		   }
		   // 동적 생성 
		   String[] title=new String[count];
		   int index=0;
		   for(int i=1;i<=4;i++)  {
			   Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=14&rtm=Y&pg="+i).get();
			   Elements t=doc.select("table.list-wrap a.title");
			   for(int j=0;j<t.size();j++)   {
				   if(t.get(j).text().contains(fd))   {
					   title[index]=t.get(j).text();
					   index++;
				   }   
			   }
		   }
		   return title;
	   }
	
	static String[] getMusician() throws Exception {
		String[] Musician = new String[200];
		int index = 0;
		for (int i=1;i<=4;i++) {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=14&rtm=Y&pg="+i).get();
			Elements t=doc.select("table.list-wrap a.artist");
			for(int j=0;j<t.size();j++) {
				String s=t.get(j).text();
				Musician[index]=s;
				index++;
			}
		}
		return Musician;
	}
	
	static String[] getAlbum() throws Exception {
		String[] album = new String[200];
		int index = 0;
		for (int i=1;i<=4;i++) {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=14&rtm=Y&pg="+i).get();
			Elements t=doc.select("table.list-wrap a.albumtitle");
			for(int j=0;j<t.size();j++) {
				String s=t.get(j).text();
				album[index]=s;
				index++;
			}
		}
		return album;
	}
}
