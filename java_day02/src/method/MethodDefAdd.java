package method;

public class MethodDefAdd {
	//public static void 메소드명() 메소드 선언부
	//{ // 코드(명령문)블럭 =메소드정의부 
	//코드은닉
	//}
		public static void hiEveryone(int age){//형식 매개변수,가인자
		// 메소드내부에서 선언된변수(지역변수)는 해당 메소드
		//내부({ })에서만 사용가능
			// 변수선언및 기본값으로 초기화
		
		
		System.out.println("좋은아침.");
		System.out.println("나이는"+age+"세");
		}
	
	//반복되는기능(문장들) 찾아서 메소드 분리 정의
	public static void main(String[] args) {
		//hiEveryone()가지는 {}코드블럭이 실행
		hiEveryone(14); //실매개변수,실인자
		hiEveryone(15);
		
		
	}
	

}
