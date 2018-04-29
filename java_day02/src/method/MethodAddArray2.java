package method;

import java.util.Arrays;

//[1, 2, 3]- ++ ->[2, 3, 4]
//동일한 복수값들을 한꺼번에 전달 및 리턴(한개만 리턴)시 배열을 사용 
public class MethodAddArray2 {
	// 입력 매개변수-> --처리 -> 결과 생성 -> 출력 or 리턴
	// 메소드호출문들의 묶음 (트랜잭션 메소드)
	public static void mn(int[] su){
		m(su);		
		m(su);
		m(su);
		n(su);
	}

	public static void main(String[] args) {
		
		
		int[] su = { 1, 2, 3 };// new int[3];
		mn(su);	
	
		System.out.println("최종배열결과 :" + Arrays.toString(su));
	}

	// 0. 입력 매개변수-> ++처리 -> 결과 생성 -> 출력 or 리턴
	// public static m( ){}
	// 1. 배열매개변수 arr
	// 5. 리턴타입은 배열자료형[]
	public static int[] m(int[] arr) {

		// 3. 각배열요소 1++
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		} // 4. 배열변수 리턴
			// Arrays.toString(arr) : 배열요소문자열
		System.out.println("1증가후 : " +Arrays.toString(arr));
		return arr;

	}

	// 입력 매개변수-> --처리 -> 결과 생성 -> 출력 or 리턴
	public static int[] n(int[] su) {
		for (int i = 0; i < su.length; i++) {
			su[i]--;
		}
		System.out.println("1감소후 : " + Arrays.toString(su));
		return su;
	}

}
