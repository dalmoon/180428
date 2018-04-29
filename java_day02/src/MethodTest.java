
// 프로그램 구조 : 프로그램 구성요소 + 요소의 배치(관계) 순서
// 사용(호출)순서(단방향) : 소비자 -> 공급자 main() -> add() 
// 구성요소단위 : 메소드
public class MethodTest {

	// 시작기능(메소드)
	public static void main(String[] args) {
		// 기능재사용(호출)
		add(1, 2, 3); // 기능메소드 실행
		// 코드 간결 ->분업화
		add(3, 4, 5);
		int ret = add(5, 6, 7);
		System.out.println("세정수 += " + ret);
		// 수정작업 단축 용이

	}

	// +,출력기능(복합 연산(명령))단위(메소드)
	public static int add(int a, int b, int c) {
		// System.out.println("세정수");
		// System.out.println("+");
		// System.out.println(a + b + c);
		int res = (a + b + c);
		return res;
	}

}
