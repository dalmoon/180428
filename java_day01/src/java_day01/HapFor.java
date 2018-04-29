package java_day01;

public class HapFor {

	public static void main(String[] args) {
		int hap = 0;// 부분합=0;

		// i 반복변수
		int i = 0;
		while (i <= 100) {
			// 부분합=부분합 +반복변수
			if (i % 2 == 0) {
				hap = hap + i;
			}
			i++;
			// i += 2;
		}

		{
			// 부분합=부분합 +반복변수
			if (i % 2 == 0) {
				hap = hap + i;
			}
			while (i <= 100)
				;
			i++;
			// i += 2;
		}
		System.out.println(hap);
		hap = 0;

		for (i = 1; i <= 99; i += 1) {
			// 부분합=부분합 +반복변수
			hap = hap + i;
		}
		System.out.println(hap);

		do {
			hap = hap + i;
			i++;
		} while (i <= 99);
		System.out.println(hap);
	}
}
