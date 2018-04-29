package method;

public class MethodReturns {

	public static void main(String[] args) {
		
		
        //adder 결과 리턴값 출력
		int result=adder(4,5);//9 //F5
		System.out.println(result);
		//double result2 = square(2);
		//System.out.println(리턴값을 가지는 메소드호출)
		//int j;
		System.out.println(square(2));		
	}
	
	//작업 기능분할도(BreakDown)
	//큰기능 -> 작은 기능 분할(세분화)
	public static int adder(int num1,int num2) {//메소드 선언
		//결과생성
		int r = num1 + num2;
		//System.out.println(r);
		return r; //9
		
	}////메소드 정의
	
	private static double square(int num1) {
			
		return num1*num1;
	}
}
