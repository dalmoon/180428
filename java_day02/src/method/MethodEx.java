package method;


/*
 * �۾�(����): �������� ���� ����� ��� (�Է� ������ =�Է�)
 * 
�۾�(����)�� ��ɺ���(BreakDown)
ū��� main()�� �۾� �Ϻ�(����ó������)�� ���� ��� sum()�� ����(����ȭ)

main(){
* �����ͱ���
-----------------
�Է°� -> �����
-----------------
* ��������
-----------------
�Է·��� (ȭ��) 
����ó������
��·��� (ȭ��)
-----------------
}
 */
public class MethodEx {
	
	//ȣ���ϴ� �޼ҵ尡 �����ϴ� ���� �ޱ����� �Ű����� ����
	// sum ����(����)�� ������ �Ҹ� 
	public static int sum(int var1,int var2){
		return var1 + var2;
	}	
	// main ����(����)�� ������ �Ҹ�
	public static void main(String[] args) {
		//����(local)����
		int var1=1,var2=2;
		{
			int i=0;
			System.out.println(i);
		}
		//System.out.println(i); //X i�� �ν� ���� X
		int res = sum(var1,var2);		
		System.out.println(res);
		//return;
		//System.out.println();
		
	}
	
	
	
	

}
