package oop;

//MP3p��ü ������
public class MP3pMain {
	
	public static void main(String[] args) {
		//4. new�� MP3pŬ������ �޸� �Ҵ��ؼ� ��ü ���� 
		//�޸� �ּ�(=����) ����
		//Ŭ����(�����ڷ���) �������� = ��ü;
		// m3�� ��ü�ּҰ� ����(4����Ʈ) 
		//�ν��Ͻ� �ļ��� �����ڷ� �ʼ� �ʱⰪ �Էº��� ���θ� �ѹ��� ���� �ʱ�ȭ
		//MP3p m3= new MP3p("Black",10);
		MP3p m3= new MP3p();
		//5. ��������.����� ����
		//m3.color="Black";
		//m3.setColor("Black");		
		//m3.color="Grexxxxxx";
		//System.out.println(m3.color);
		//System.out.println("��=" + m3.getColor());
		///////////////////////////////////
		//m3.memory=-10;
		//m3.setMemory(-10);
		//System.out.println("�޸�=" + m3.getMemory());
		m3.memoryUp(100);
		System.out.println("�����޸�=" + m3.getMemory());
		//----------------------------
		System.out.println(m3.toString());
		
	}

}
