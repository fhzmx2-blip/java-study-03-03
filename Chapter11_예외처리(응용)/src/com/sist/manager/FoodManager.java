package com.sist.manager;
import java.io.*;

import com.sist.commons.Manager;
import com.sist.vo.*;
public class FoodManager implements Manager {
   // 맛집 데이터 저장 
   public static FoodVo[] foods=new FoodVo[512];
   /*
    *    1. 데이터형 
    *        = 기본형 
    *           정수(int).....
    *        = 참조형 
    *           클래스 , 배열 => 주소를 이용한 방식 
    *           ----- 자바 라이브러리 클래스 / 사용자 정의 
    *           클래스 1개는 한개 맛짖에 대한 정보를 가지고 있다 
    *    2. 데이터 공유 
    *       => 모든 사용자가 같은 데이터를 사용 => 공유 
    *          => static : 오라클 (데이터베이스 => 공유된 데이터)
    *    3. 모든 클래스에서 접근이 가능 => public 
    *       모든 변수는 private이 아니다 => 선택적이다 
    *    4. 초기화 => 값을 저장 
    *       1) 명시적 초기화   int a=10
    *       2) 초기화 블록 
    *          인스턴스 {}
    *          정적    static{}
    *          생성자 
    *          => 클래스 {} 은 선언만 가능 
    *             => 파일읽기(X) 
    *          ** static변수 => static{}
    *          ** 인스턴스는 => 생성자()
    *         ---------------------------- 상속예외
    */
   // 초기화 => 배열값 저장 
   static 
   {
	   try
	   {
		   // 1. BufferedReader 사용 (한 줄씩 정확하게 읽기 위함)
		   BufferedReader br = new BufferedReader(new FileReader("c:\\javaDev\\food.txt"));
		   String line = "";
		   int i = 0;
		   
		   while((line = br.readLine()) != null)
		   {
			   if(line.trim().isEmpty()) continue; // 빈 줄 건너뛰기

			   String[] s = line.split("\\|");
			   if(s.length < 12) continue; // 데이터가 부족한 줄(잘못된 줄) 건너뛰기

			   FoodVo vo = new FoodVo();
			   // s[0]에 "0|아름드리" 처럼 섞여 들어가는 것을 방지하기 위해 trim() 사용
			   vo.setNo(Integer.parseInt(s[0].trim()));
			   vo.setName(s[1]);
			   vo.setType(s[2]);
			   vo.setPhone(s[3]);
			   vo.setAddress(s[4]);
			   vo.setScore(Double.parseDouble(s[5]));
			   vo.setParking(s[6]);
			   vo.setPoster(s[7]);
			   vo.setTime(s[8]);
			   vo.setContent(s[9]);
			   vo.setTheme(s[10]);
			   vo.setPrice(s[11]);
			   
			   if(i < foods.length) {
				   foods[i] = vo;
				   i++;
			   }
		   }
		   br.close();
		   
	   }catch(Exception ex){
		   ex.printStackTrace(); // 에러 발생 시 로그 확인
	   }
   }

   @Override
   public FoodVo[] food_list(int page) {
	   int rowSize = 10;
	   int start = (page - 1) * rowSize;
	   
	   // 1. 실제로 담길 개수 파악
	   int count = 0;
	   for(int i = 0; i < rowSize; i++) {
		   if(start + i < foods.length && foods[start + i] != null) {
			   count++;
		   }
	   }

	   // 2. 정확한 크기의 배열 생성
	   FoodVo[] food = new FoodVo[count];
	   for(int i = 0; i < count; i++) {
		   food[i] = foods[start + i];
	   }
	   
	   return food;
   }
   @Override
   public FoodVo food_detail(int no) {
	// TODO Auto-generated method stub
	
	return foods[no-1];
   }
   @Override
   public FoodVo[] food_find(String type, String fd) {
	// TODO Auto-generated method stub
	return null;
   }
   @Override
   public FoodVo[] food_filter(String type) {
       int row = 0;
       // 1. 조건에 맞는 데이터 개수 파악 (null 체크 필수)
       for (FoodVo vo : foods) {
           if (vo != null && vo.getType().contains(type)) {
               row++;
           }
       }

       // 2. 결과 배열 생성
       FoodVo[] food = new FoodVo[row];
       int i = 0;
       // 3. 실제 데이터 담기 (null 체크 필수)
       for (FoodVo vo : foods) {
           if (vo != null && vo.getType().contains(type)) {
               food[i] = vo;
               i++;
           }
       }
       
       return food;
   }
   @Override
   public int food_total() {
	// TODO Auto-generated method stub
	 return (int)(Math.ceil(foods.length/10.0));
   }
}