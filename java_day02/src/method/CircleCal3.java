package method;

import java.util.Scanner;

//작업 (3 원들 통계합정보)
//기능 : 원넓이 ,둘레 
public class CircleCal3 {
	public static void main(String[] args) {

		double[] rads = new double[3];
		double areaResult = 0.0;
		double roundResult = 0.0;

		double[] summary = processCircle(rads, areaResult, roundResult);
		System.out.println("원넓이 합 \\ 원둘레 합");
		for (int i = 0; i < summary.length; i++) {
			System.out.print(summary[i] + "   ");
		}

	}

	public static double[] processCircle(double[] rads, double areaResult, double roundResult) {
		Scanner sc = new Scanner(System.in);
		double[] ret = new double[2]; // double 변수 2개 가지는 배열

		for (int i = 0; i < rads.length; i++) {
			System.out.println((i + 1) + "번 반지름>>");
			rads[i] = sc.nextDouble();// 실수읽기
			areaResult += calArea(rads[i]);
			roundResult += calRound(rads[i]);
		}
		ret[0] = areaResult;
		ret[1] = roundResult;
		return ret;
		// System.out.println("원넓이 합=" + areaResult);
		// System.out.println("원둘레 합=" + roundResult);
	}

	public static double calArea(double r) {
		return r * r * 3.14;

	}

	public static double calRound(double r) {
		return 2 * r * 3.14;

	}
}
