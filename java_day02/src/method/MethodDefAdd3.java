package method;

public class MethodDefAdd3 {
	//public static void 메소드명(){}
		public static void hiEveryone(int age,int height,int weight,String addr){//매개변수
		// 메소드내부에서 선언된변수(지역변수)는 해당 메소드
		//내부({ })에서만 사용가능
			// 변수선언및 기본값으로 초기화
		
		//age=15;
		System.out.println("좋은아침.");
		System.out.println("나이는"+age+"세");
		System.out.println("신장은"+height+"cm");
		System.out.println("체중은"+weight+"kg");
		}
	
	//반복되는기능(문장들) 찾아서 메소드 분리 정의
	public static void main(String[] args) {
		//hiEveryone()가지는 {}코드블럭이 실행
		hiEveryone(15,170,60,"서울");
		hiEveryone(13,160,50,"부산");
		
		
	}
	

}
