package java_day01;

public class IFTest2 {

	public static void main(String[] args) {
		// 1. 데이터 구조 및 대입연산
		// 번수크기 4 변수명 선언 : 연속변수
		int num1 = 5;
		// 짝,홀 여부 : 범주변수
		boolean res = false;
		// ------------------------
		// 2. 산출(리턴,저장,뷰)
		// 문장 : 절분리
		res = num1 % 2 == 0; // res가 2의 배수
		System.out.println(res);
		if (res) { // 조건이 참이면
			System.out.println("짝수");
		} else { // 아니면(거짓)
			System.out.println("홀수");
		}
	}
}
