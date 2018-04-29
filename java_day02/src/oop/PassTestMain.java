package oop;

public class PassTestMain {

	// 응시생 3명은 PassTest 합격통지클래스를 사용
	// PassTest의 isPass를 공유(static)
	// ->PassTest의 isPass를 비공유(non_static)

	public static void main(String[] args) {

		// PassTest.isPass=false;
		// 각 인스턴스마다 자신만의 isPass라는 
		// 변수메모리를 가짐
		// 첫번째 응시생의 PassTest 인스턴스
		
		PassTest pt01 = new PassTest();
		Student st01= new Student();
		st01.code=-1001;
		st01.code=st01.getCode();
//		if(st01.code <0){
//			st01.code =-st01.code;
//		}
		pt01.isPass=true;
		
		System.out.print("응시생1:" +st01.code);
		System.out.println(pt01.isPass ? "합격" : "불합격");
	
		// 두번째 응시생의 PassTest 인스턴스
		PassTest pt02 = new PassTest();
		pt01.isPass=true;
		System.out.print("응시생2:");
		System.out.println(pt01.isPass ? "합격" : "불합격");
		
		// 세번째 응시생의 PassTest 인스턴스
		PassTest pt03 = new PassTest();
		pt01.isPass=false;
		System.out.print("응시생3:");
		System.out.println(pt01.isPass ? "합격" : "불합격");
		
		
			

//		for (int i = 0; i < 3; i++) {
//			System.out.print("응시생" + i + ":");
//			System.out.println(PassTest.isPass ? "합격" : "불합격");
//		}
	}

}
