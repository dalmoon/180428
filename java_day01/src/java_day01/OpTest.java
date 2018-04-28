package java_day01;

public class OpTest {

	public static void main(String[] args) {
		// 1. 데이터 구조 및 대입연산
		// 변수크기 4 변수명 선언
		int num1 = 0;
		int num2 = 0;
		double num3 = 0.0;

		num1 = 3;
		num2 = 2;
		num3 = 1.5;
		// ---------------------------------
		// 2. 데이터 산술연산
		int res = num1 + num2;
		// ---------------------------------
		// 3. 데이터결과 출력연산
		System.out.println(res);

		// res = num1 / num2; // 3/2 몫(정수)
		res = num1 % num2; // 3/2 나머지 1
		System.out.println(res);
		// ---------------------------------
		int large_num = (int) num3;
		System.out.println("정수=" + large_num);
		// 소수 추출
		double small_num = num3 - large_num;
		System.out.println("소수=" + small_num);

		// ---------------------------------
		double d = 1;
		int i = (int) 1.5;
		i = (int) d; // d의 값을 int 변환

		// d = (double) 3 / 2;
		d = 3.0 / 2;
		System.out.println(d);
		// ---------------------------------
		int x = 0;
		x = x + 1;
		x += 1;
		x++;
		System.out.println(x);
		x -= 1;
		x--; // x에 출력 후 뺄셈 (내가양보)
		--x; // 뺄셈 후 x에 출력 (내가먼저)
		System.out.println(--x);
		// ---------------------------------
		int n = 0;
		// int m = n--; // 0
		int m = --n; // -1
		System.out.println(m);
	}
}
