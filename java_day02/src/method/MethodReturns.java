package method;

public class MethodReturns {

	public static void main(String[] args) {
		
		
        //adder ��� ���ϰ� ���
		int result=adder(4,5);//9 //F5
		System.out.println(result);
		//double result2 = square(2);
		//System.out.println(���ϰ��� ������ �޼ҵ�ȣ��)
		//int j;
		System.out.println(square(2));		
	}
	
	//�۾� ��ɺ��ҵ�(BreakDown)
	//ū��� -> ���� ��� ����(����ȭ)
	public static int adder(int num1,int num2) {//�޼ҵ� ����
		//�������
		int r = num1 + num2;
		//System.out.println(r);
		return r; //9
		
	}////�޼ҵ� ����
	
	private static double square(int num1) {
			
		return num1*num1;
	}
}
