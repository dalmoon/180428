package oop;

//클래스 =프로그램 기본단위(구성요소)
//객체 = 전역변수 + 메소드
//분류 정리정돈 =유관된 요소들별로 명백히 분류
// 두정수합 , 원계산
public class OOPCircleTest {
		
	
	public static double  rad=0.0; //반지름
	public static double  area=0.0; //넓이
	//-------------------------------
	
	
	public static void input() {
		 	rad=1.2;}
	public static void calculate() {
		
		area = 2*rad*3.14;	}

	public static void output() {
		
		System.out.println("원둘레 = "+area);
	}
}
