package method;

import java.util.Scanner;

public class MethodDefAdd2 {
	//1. public static void 메소드명(){}
	
	public static void m1(int i) {
		System.out.println("m1() 호출");
	}	
	public static void m2(int i) {
		System.out.println("m2() 호출");
	}
	public static void m3(double d) {
		System.out.println("m3() 호출");
	}
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
		
	//0. 반복되는기능(문장들) 찾아서 메소드 분리 정의
	public static void main(String[] args) {
		//2. m1()호출 m1()가지는 {}코드블럭이 실행		
		m1(1);
		m2(2);
		m3(1.2);
		add(1, 2);
		
		Scanner console = new Scanner(System.in);
		System.out.println("-- 마이프로그램 ver 1.0--");
		System.out.print(">>");
		String menu= console.next();
//		if(menu.equals("mone")){
//			m1(1);
//		}else if(menu.equals("mtwo")){
//			m2(2);
//		}else if(menu.equals("help")){
//			System.out.println("메뉴");
//			System.out.println("mone,mtwo");
//		}else{
//			System.out.println("'"+ menu+"' 은(는) 내부 또는 외부 명령, 실행할 수 있는 프로그램, 또는배치 파일이 아닙니다.");
//		}
		
		if(menu.equals("1") || menu.equals("mone")){
			m1(1);
		}else if(menu.equals("2")||menu.equals("mtwo")){
			m2(2);
		}else if(menu.equals("help")){
			System.out.println("메뉴");
			System.out.println("1. mone,2. mtwo");
			System.out.println("메뉴 번호(명) 입력");
		}else{
			System.out.println("'"+ menu+"' 은(는) 내부 또는 외부 명령, 실행할 수 있는 프로그램, 또는배치 파일이 아닙니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
