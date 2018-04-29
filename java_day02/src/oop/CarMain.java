package oop;

public class CarMain {

	public static void main(String[] args) {
		System.out.println("--자동차 주행시스템--");
		System.out.println("1. 자동차 주행시작");
		//참조변수는 실체를 참조하지않는다.
		//null을 참조하는 변수를 NullPointer라고 함
		//CarMgr myCarMgr = null;//null:미실체
		//참조변수는 실체의 참조를 가짐
		//참조변수는 실체를 참조한다(가리킨다.)
		Car myCar= new Car();
		System.out.println("2. 자동차 실체 생성");
		myCar.speedUp();
		System.out.println("3. 자동차 실체 주행중");
		myCar.stop();
		System.out.println("4. 자동차 정차(주행)완료");
	}
}
