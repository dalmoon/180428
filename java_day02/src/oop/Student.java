package oop;

// 객체 (개발자 정의 새로운  응시학생 데이터)
// 클래스 (개발자 정의 새로운  응시학생 
// 복합자료(데이터)형(구조))
// 객체는 자신의 변수에 대한 메소드를 제공해야 한다 
public class Student {
	/*
	 * 이름 수험코드 합격여부
	 */
	public String name;
	public int code;
	public boolean isPass;
	
	//변수에 대한 메소드 제공
	
	public int getCode() {
		
		if(code <0){
			code =-code;
		}
		return code;
	}
	
	
	
	
	
	
	

}
