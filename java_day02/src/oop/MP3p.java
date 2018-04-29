package oop;

/*
 * 1. MP3 객체구조분석(모델링)
 구조: 공통속성(색,메모리크기)과 
 메모리업,색설정 기능(동작)
 */
// 1.5 MP3p는 3개의 구성요소(멤버)로 묶임(캡슐화)
public class MP3p{ //2. 클래스(참조자료형) 선언
	//3. 속성에 상응하는 멤버변수(필드)선언
	private String color;//색은닉
	private int memory; //메모리크기 은닉
	
	public MP3p(){
		color="블랙";
		memory=100;
	}
	
//	public MP3p(String color, int memory) {
//		//this.변수=>멤버변수
//		this.color = color;
//		this.memory = memory;
//	}
	
	//6. 전달색을 color에 설정
	public void setColor(String c) {
		color =c;
		//검증
		if(!(color.equals("Red")
				||color.equals("White"))){
			//정제
			color="Black";
		}
	}
	// color를 리턴
	public String getColor() {
		return color;
	}
	
	// get+변수명() : getter
	public int getMemory() {
		return memory;
	}
	// set+변수명() : setter //완전수정(교체)
	public void setMemory(int m) {
		if(m <=0 || m >1000){ //m이 0 이하
			m=1;
		}
		memory = m;
	}
	//메모리  추가
	public void memoryUp(int n) {//증가크기
		memory = memory + n;
	}
	@Override
	public String toString() {
		return "MP3p [color=" + color + ", memory=" + memory + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
