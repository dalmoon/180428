package oop;

//�ڵ���������
public class CarMgr {//����
    //�����ڷ��� ��������� ����� �⺻������ null�� ���� 
	//�⺻�ڷ��� ��������� �����
	//�������� 0
	//�Ǽ��� 0.0
	//���� false
	//String null
	private Car myCar;
	
	// Car ��ü ����
	public void createCar() {
		myCar = new Car();
	}
	
	//����
	public void driveCar() {
		for (int i = 0; i <10; i++) {
			myCar.speedUp();
		}
		for (int i = 0; i <5; i++) {
			myCar.speedDown();
		}
				
	}
	//����
	public void stopCar() {
		myCar.stop();
	}
	
	
}//����
