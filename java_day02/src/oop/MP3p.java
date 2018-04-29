package oop;

/*
 * 1. MP3 ��ü�����м�(�𵨸�)
 ����: ����Ӽ�(��,�޸�ũ��)�� 
 �޸𸮾�,������ ���(����)
 */
// 1.5 MP3p�� 3���� �������(���)�� ����(ĸ��ȭ)
public class MP3p{ //2. Ŭ����(�����ڷ���) ����
	//3. �Ӽ��� �����ϴ� �������(�ʵ�)����
	private String color;//������
	private int memory; //�޸�ũ�� ����
	
	public MP3p(){
		color="��";
		memory=100;
	}
	
//	public MP3p(String color, int memory) {
//		//this.����=>�������
//		this.color = color;
//		this.memory = memory;
//	}
	
	//6. ���޻��� color�� ����
	public void setColor(String c) {
		color =c;
		//����
		if(!(color.equals("Red")
				||color.equals("White"))){
			//����
			color="Black";
		}
	}
	// color�� ����
	public String getColor() {
		return color;
	}
	
	// get+������() : getter
	public int getMemory() {
		return memory;
	}
	// set+������() : setter //��������(��ü)
	public void setMemory(int m) {
		if(m <=0 || m >1000){ //m�� 0 ����
			m=1;
		}
		memory = m;
	}
	//�޸�  �߰�
	public void memoryUp(int n) {//����ũ��
		memory = memory + n;
	}
	@Override
	public String toString() {
		return "MP3p [color=" + color + ", memory=" + memory + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
