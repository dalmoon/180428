package method;

//작업 (원정보)
//기능 : 원넓이 ,둘레 ,중복(공통)기능 
public class CircleCal {

	public static void main(String[] args) {
		// println(리턴메소드호출문)
		System.out.println(calArea(1.2));
		System.out.println(calRound(1.2));
	}

	// 원넓이
	public static double calArea(double r) {
		return r * r * 3.14; // c + 클릭

	}

	// 둘레
	public static double calRound(double r) {
		return 2 * r * 3.14;

	}
}
