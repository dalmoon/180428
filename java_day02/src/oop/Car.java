package oop;

public class Car {

	// public static int speed=10;
	private int speed;// 은닉 클래스 멤버변수
	// private String carName;

	// 주행,정차작업필요한 기능
	// 속도제어():가속,감속,정지
	public void speedUp() {
		speed++;
		System.out.println("속도=" + speed);

	}

	public void speedDown() {
		speed--;
		System.out.println("속도=" + speed);
	}

	public void stop() {
		speed = 0;
		System.out.println("속도=" + speed);
	}

}
