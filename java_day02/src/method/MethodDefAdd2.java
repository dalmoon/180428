package method;

import java.util.Scanner;

public class MethodDefAdd2 {
	//1. public static void �޼ҵ��(){}
	
	public static void m1(int i) {
		System.out.println("m1() ȣ��");
	}	
	public static void m2(int i) {
		System.out.println("m2() ȣ��");
	}
	public static void m3(double d) {
		System.out.println("m3() ȣ��");
	}
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
		
	//0. �ݺ��Ǵ±��(�����) ã�Ƽ� �޼ҵ� �и� ����
	public static void main(String[] args) {
		//2. m1()ȣ�� m1()������ {}�ڵ���� ����		
		m1(1);
		m2(2);
		m3(1.2);
		add(1, 2);
		
		Scanner console = new Scanner(System.in);
		System.out.println("-- �������α׷� ver 1.0--");
		System.out.print(">>");
		String menu= console.next();
//		if(menu.equals("mone")){
//			m1(1);
//		}else if(menu.equals("mtwo")){
//			m2(2);
//		}else if(menu.equals("help")){
//			System.out.println("�޴�");
//			System.out.println("mone,mtwo");
//		}else{
//			System.out.println("'"+ menu+"' ��(��) ���� �Ǵ� �ܺ� ���, ������ �� �ִ� ���α׷�, �Ǵ¹�ġ ������ �ƴմϴ�.");
//		}
		
		if(menu.equals("1") || menu.equals("mone")){
			m1(1);
		}else if(menu.equals("2")||menu.equals("mtwo")){
			m2(2);
		}else if(menu.equals("help")){
			System.out.println("�޴�");
			System.out.println("1. mone,2. mtwo");
			System.out.println("�޴� ��ȣ(��) �Է�");
		}else{
			System.out.println("'"+ menu+"' ��(��) ���� �Ǵ� �ܺ� ���, ������ �� �ִ� ���α׷�, �Ǵ¹�ġ ������ �ƴմϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
