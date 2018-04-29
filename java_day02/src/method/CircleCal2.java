package method;

//작업 (원정보)
//큰기능(job) -> 작은 기능(task) 분할(세분화)
//기능 : 원넓이 ,둘레 ,중복(공통)기능 
//main -> calArea -> calCommon
//	+-> calRound -> calCommon
public class CircleCal2 {

	public static void main(String[] args) {

		System.out.println(calArea(1.2));
		System.out.println(calRound(1.2));
	}

	// r*3.14 공통코드 분리
	public static double calCommon(double r) {
		return r * 3.14;
	}

	// sub가 또다른 sub호출
	public static double calArea(double r) {
		return r * calCommon(r); // c + 클릭

	}

	public static double calRound(double r) {
		return 2 * calCommon(r);

	}
}
