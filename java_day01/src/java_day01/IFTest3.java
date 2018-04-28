package java_day01;

//조건 : 주어진 정수를 양수,0,음수로 판별 출력
//입력데이터 : 주어진 정수
//판별식 : 주어진 정수>0 ==0, 정수<0
//출력결과 : 양수,0,음수
public class IFTest3 {

	public static void main(String[] args) {
		// 1. 데이터 구조 및 대입연산
		// 번수크기 4 변수명 선언 : 연속변수
		int num = 10;
		String res = "미정";
		// 짝,홀 여부 : 범주변수
		// ------------------------
		// 2. 산출(리턴,저장,뷰)
		// 문장 : 절분리
		if (num > 0) { // 조건이 참이면
			// System.out.println("양수");
			res = "양수";
		} else if (num == 0) { // 아니면(거짓)
			// System.out.println("0");
			res = "0";
		} else {
			// System.out.println("음수");
			res = "음수";
		}
		System.out.println(res);
	}
}
