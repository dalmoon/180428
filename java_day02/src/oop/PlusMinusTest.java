package oop;

//��ü��������
public class PlusMinusTest {	
	
	public static void print(int result) {
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		//��ü (�������º�����)
		//���α׷�(Ŭ����)��.�޼ҵ�
//		print(PlusTest.plus());		
//		print(MinusTest.minus());//result -1
//		MinusTest.a=5;
//		MinusTest.b=10;
//		print(MinusTest.minus());//result -5
		//��ü (������������)
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
