package oop;

public class PassTestMain {

	// ���û� 3���� PassTest �հ�����Ŭ������ ���
	// PassTest�� isPass�� ����(static)
	// ->PassTest�� isPass�� �����(non_static)

	public static void main(String[] args) {

		// PassTest.isPass=false;
		// �� �ν��Ͻ����� �ڽŸ��� isPass��� 
		// �����޸𸮸� ����
		// ù��° ���û��� PassTest �ν��Ͻ�
		
		PassTest pt01 = new PassTest();
		Student st01= new Student();
		st01.code=-1001;
		st01.code=st01.getCode();
//		if(st01.code <0){
//			st01.code =-st01.code;
//		}
		pt01.isPass=true;
		
		System.out.print("���û�1:" +st01.code);
		System.out.println(pt01.isPass ? "�հ�" : "���հ�");
	
		// �ι�° ���û��� PassTest �ν��Ͻ�
		PassTest pt02 = new PassTest();
		pt01.isPass=true;
		System.out.print("���û�2:");
		System.out.println(pt01.isPass ? "�հ�" : "���հ�");
		
		// ����° ���û��� PassTest �ν��Ͻ�
		PassTest pt03 = new PassTest();
		pt01.isPass=false;
		System.out.print("���û�3:");
		System.out.println(pt01.isPass ? "�հ�" : "���հ�");
		
		
			

//		for (int i = 0; i < 3; i++) {
//			System.out.print("���û�" + i + ":");
//			System.out.println(PassTest.isPass ? "�հ�" : "���հ�");
//		}
	}

}
