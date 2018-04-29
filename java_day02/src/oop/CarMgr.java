package oop;

//자동차관리자
public class CarMgr {//선언
    //참조자료형 멤버변수는 선언시 기본값으로 null을 가짐 
	//기본자료형 멤버변수는 선언시
	//정수형은 0
	//실수형 0.0
	//논리형 false
	//String null
	private Car myCar;
	
	// Car 실체 생성
	public void createCar() {
		myCar = new Car();
	}
	
	//주행
	public void driveCar() {
		for (int i = 0; i <10; i++) {
			myCar.speedUp();
		}
		for (int i = 0; i <5; i++) {
			myCar.speedDown();
		}
				
	}
	//정차
	public void stopCar() {
		myCar.stop();
	}
	
	
}//정의
