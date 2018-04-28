package java_day01;

/*
 * 년도를 윤년여부 판별 혹은 평년 출력
 * 입력변수 : 년도 year
 * 출력변수 : 년도 레이블 yun_label
 * 년도를 4배수이고 100의배수이면 윤년
 * 이거나 400의 배수는 무조건 윤년
 */
public class IFTest4 {

	public static void main(String[] args) {
		int year = 2020;
		String yun_label = "평년";
		boolean yun = false;
		yun = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		if (yun) {
			yun_label = "윤년";
		}
		System.out.println(yun_label);
	}
}
