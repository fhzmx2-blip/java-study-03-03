import java.util.*;
class Diary
{
	int year,month,week,lastday;
	void 사용자입력()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		year=scan.nextInt();
		System.out.println("월 입력:");
		month=scan.nextInt();
	}
	void 요일_마지막날_구하기()
	{
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONDAY, month-1);
		cal.set(Calendar.DATE, 1);
		
		week=cal.get(Calendar.DAY_OF_WEEK);
		lastday=cal.getActualMaximum(Calendar.DATE);
		week=week-1;
	}
	
	void print()
	{
		System.out.println(year+"년도 "+month+"월\n");
		String[] strWeek={"일","월","화","수","목","금","토"};
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		System.out.println("\n");
		
		/*
		 *   Calendar => month=0,week=1
		 */
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%02d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
	}
	
}
public class 클래스_멤버변수_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Diary d=new Diary();
		d.사용자입력();
		d.요일_마지막날_구하기();
		d.print();
	}

}