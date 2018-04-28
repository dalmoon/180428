package java_day01;

public class OpTest3 {

	public static void main(String[] args) {
		// 1. 데이터 구조 및 대입연산
		// 번수크기 4 변수명 선언 : 연속변수
		int num1 = 10;
		// 짝,홀 여부 : 범주변수
		boolean res = false;
		// ------------------------
		// 2. 산출(리턴,저장,뷰)
		res = num1 % 2 == 0; // res가 2의 배수
		System.out.println(res);
		if (res = num1 % 2 != 0) {
			System.out.println("짝수");
		}
		// 삼항조건연산자 (조건?조건이 참인 경우 결과 : 조건이 거짓인 경우 결과)
		String result = res ? "짝수" : "음수";
		System.out.println(result);

	}
}
