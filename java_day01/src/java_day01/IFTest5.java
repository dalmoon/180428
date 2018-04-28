package java_day01;

import java.util.Scanner;

/*
 * 년도를 윤년여부 판별 혹은 평년 출력
 * 변경내역 : 사용자가 콘솔창에서 년도 입력
 */
public class IFTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int year;

		System.out.print("윤년을 입력하세요.");
		year = sc.nextInt();

		String yun_label = "평년";
		boolean yun = false;
		yun = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		if (yun) {
			yun_label = "윤년";
		}
		System.out.println(yun_label);
	}
}
