package java_day01;

public class FirstQuiz {
	public static void main(String[] args) {

		int num = 0;
		int position_num = 0;
		int sum = 0;

		num = 1234;

		while (num > 0) {
			position_num = num % 10;
			sum += position_num;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
