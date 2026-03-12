/*
 * 배열은 일반 변수 여러개가 아닌 이름 1개를 이용하기에 데이터 관리에 용이하다
 * 순차적으로 인덱스 번호를 가지고 있어서 반복문 수행하기에 좋으며
 * 고정적이라 한번 지정하면 변경이 불가하다
 * 
 * 얕은 복사와 깊은 복사
 */

import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 얕은 복사의 예시 (주소가 복사되는 식이라 한 쪽이 바뀌면 다른 쪽도 바뀐다) 
		int[] arr= {100,200, 300,400,500};
		int[] copy=arr;
		copy[0]=1000;
		System.out.println(arr[0]);
//		System.out.println("arr="+Arrays.toString(arr));
//		System.out.println("copy="+Arrays.toString(copy));	
		int[] copy2=arr.clone();
		copy2[0]=5000;
		
		int[] copy3=arr.clone();
		copy3[0]=7000;
		
		System.out.println("=====결과======");
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("copy="+Arrays.toString(copy));
		System.out.println("copy2="+Arrays.toString(copy2));
		System.out.println("copy3="+Arrays.toString(copy3));

	}

}
