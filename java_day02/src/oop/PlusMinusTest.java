package oop;

//객체지향으로
public class PlusMinusTest {	
	
	public static void print(int result) {
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		//객체 (변수상태비유지)
		//프로그램(클래스)명.메소드
//		print(PlusTest.plus());		
//		print(MinusTest.minus());//result -1
//		MinusTest.a=5;
//		MinusTest.b=10;
//		print(MinusTest.minus());//result -5
		//객체 (변수상태유지)
		MinusTest mt=new MinusTest();
		mt.a=1;
		mt.b=2;
		print(mt.minus());
		
		MinusTest mt2=new MinusTest();
		//mt2.a=1;
		mt2.setA(1);
		mt2.b=10;
		print(mt2.minus());
		print(mt.minus());
		
		
		
		
		
	}
	
}
