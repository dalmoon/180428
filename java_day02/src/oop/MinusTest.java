package oop;
//클래스 =프로그램 기본단위(구성요소)=객체
//=유관 전역변수 + 메소드
//분류 정리정돈 =유관된 요소들별로 명백히 분류
public class MinusTest {
	//public static  int a=1,b=2,result=0;
//	public static int minus() {
//		return result=a-b;		
//				
//	}
	
	private int a=1,b=2,result=0;
	
	
	
	public int getA() {
		return a;
	}



	public void setA(int aa) {
		if(aa<0) aa=0;
		a = aa;
	}



	public int minus() {
		return result=a-b;		
				
	}
	
	
}
