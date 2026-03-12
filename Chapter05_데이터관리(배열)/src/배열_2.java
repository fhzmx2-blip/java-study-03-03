/*
 *	1. 배열 선언
 *	2. 배열 초기화
 *	3. 반복문을 이용한 데이터 출력
 *	4. 배열 복사
 *	5. 동적 생성 
 *
 *	int[] arr
 *	char[] arr
 *	String[] arr
 *	double[] arr
 *	boolean[] arr
 *
 *	'자료형'[n] arr => arr이라는 배열(목록)은 '자료형'의 자료형을 띄고 있으며, 거기서 n번째의 자료를 가져온다는 뜻
 *
 *
 * *       int[] arr={10,20,30,40,50}; // 선언+초기화 
 *       ==> 참조변수 (저장된 메모리의 주소만 가지고 있는 변수)
 *        stack      heap
 *                       0    1    2    3    4
 *       --arr--       --------------------------
 *        100           100   20   30   40   50
 *       -------    100--------------------------
 *                       |    |    |    |     |
 *                                          arr[4]
 *                                     arr[3]
 *                               arr[2]
 *                          arr[1]
 *                     arr[0]
 *                     ------ 사용법은 일반 변수와 동일 
 *                     arr[0]=100
 *                     --------------------
 *                       범위를 초과하면 오류 발생 
 *                       arr[5] => 오류발생 
 *                          ArrayIndexOutOfBoundsException
 */

public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		
//		arr[0]=100;
//		arr[1]=200;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		for (int i=0; i<5;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for(double a:arr) {
			System.out.println(a);
		}
	}

}
