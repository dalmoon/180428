package method;

public class MethodDefAdd3 {
	//public static void �޼ҵ��(){}
		public static void hiEveryone(int age,int height,int weight,String addr){//�Ű�����
		// �޼ҵ峻�ο��� ����Ⱥ���(��������)�� �ش� �޼ҵ�
		//����({ })������ ��밡��
			// ��������� �⺻������ �ʱ�ȭ
		
		//age=15;
		System.out.println("������ħ.");
		System.out.println("���̴�"+age+"��");
		System.out.println("������"+height+"cm");
		System.out.println("ü����"+weight+"kg");
		}
	
	//�ݺ��Ǵ±��(�����) ã�Ƽ� �޼ҵ� �и� ����
	public static void main(String[] args) {
		//hiEveryone()������ {}�ڵ���� ����
		hiEveryone(15,170,60,"����");
		hiEveryone(13,160,50,"�λ�");
		
		
	}
	

}
