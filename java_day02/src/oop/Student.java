package oop;

// ��ü (������ ���� ���ο�  �����л� ������)
// Ŭ���� (������ ���� ���ο�  �����л� 
// �����ڷ�(������)��(����))
// ��ü�� �ڽ��� ������ ���� �޼ҵ带 �����ؾ� �Ѵ� 
public class Student {
	/*
	 * �̸� �����ڵ� �հݿ���
	 */
	public String name;
	public int code;
	public boolean isPass;
	
	//������ ���� �޼ҵ� ����
	
	public int getCode() {
		
		if(code <0){
			code =-code;
		}
		return code;
	}
	
	
	
	
	
	
	

}
