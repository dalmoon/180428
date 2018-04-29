package method;


/*
 * 작업(목적): 두정수를 더한 결과를 출력 (입력 개발자 =입력)
 * 
작업(목적)의 기능분할(BreakDown)
큰기능 main()의 작업 일부(덧셈처리로직)를 작은 기능 sum()로 분할(세분화)

main(){
* 데이터구조
-----------------
입력값 -> 결과값
-----------------
* 로직구조
-----------------
입력로직 (화면) 
덧셈처리로직
출력로직 (화면)
-----------------
}
 */
public class MethodEx {
	
	//호출하는 메소드가 전달하는 값을 받기위한 매개변수 노출
	// sum 종료(리턴)시 스택은 소멸 
	public static int sum(int var1,int var2){
		return var1 + var2;
	}	
	// main 종료(리턴)시 스택은 소멸
	public static void main(String[] args) {
		//지역(local)변수
		int var1=1,var2=2;
		{
			int i=0;
			System.out.println(i);
		}
		//System.out.println(i); //X i를 인식 접근 X
		int res = sum(var1,var2);		
		System.out.println(res);
		//return;
		//System.out.println();
		
	}
	
	
	
	

}
