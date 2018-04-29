package java_day01;

import java.util.Scanner;
// boolean 여부 = false
// (할인가 > 5000) 여부 = true

// boolean 여부 = true
// (할인가 < 5000) 여부 = false

/*
 * 임의의 정수(5)  소수판별 (2,3,4 로 나누면 0으로 떨어지지 X 약수 X)
 * 소수는 1보다 큰 자연수 중에서 
 * 그 약수가 1과 자기 자신뿐인 수이다. 
 * 즉  소수는 자기 자신과 1을 제외하고는 
 * 약수가 없는(어떤 수로도 나눠지지 않는) 수이다.
 * 10 이하의 소수는 2, 3, 5, 7
 * (1은 보통 포함시키지 않음)  */

//    1... n(약수,배수)....
public class FindPrimeNumber {

	public static void main(String[] args) {

		// 입력변수
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수>>");
		int num = sc.nextInt();
		// 판별임시변수
		boolean res = false; // 소수여부
		boolean skip = false; // 비소수를 판단하기위한 변수
		// 출력변수
		String output = "모름";
		// 5: 자기 자신과 1을 제외하고
		// 2,3,4 나눠지지(나머지가 0) 않으므로 소수
		for (int i = 2; i < num; i++) { // i =2,3,4
			if (num % i == 0) { // 비소수인경우 res가 false를 유지하기위해서
				skip = true;// res=true; 건너띄기
				break;
			}
		} // -end for

		if (!skip)
			res = true; // 소수
		if (res) {
			output = "소수";
		} else {
			output = "비소수";
		}
		System.out.println(output);
	}
}
