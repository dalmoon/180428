package method;

public class MethodTest {
	
	//시작기능(메소드)
	public static void main(String[] args) {
		// 기능재사용(호출)
		add(); //기능메소드 실행		
		// 코드 간결 ->분업화
		add();
		add();
		// 수정작업 단축 용이
		
		
	}	
	
	//+,출력기능(복합 연산(명령))단위(메소드)
		public static void add() {
			 int a=1,b=2,c=3;
			System.out.println("두정수");
			System.out.println("+");
			System.out.println(a+b+c);
			}
	
}
