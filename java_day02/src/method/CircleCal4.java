package method;

import java.util.Scanner;

//작업 (원들 통계합정보)
//기능 :원개수 ,반지름,메뉴번호 ->  원넓이 ,둘레 선택 -> (원들 통계합정보)) 
// 메뉴
/*
 *원넓이(1)  둘레(2)  
 >>
 */
public class CircleCal4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int len = 0;
		//사용자 선택 노출 기능 = 사용자메뉴=명령어(기능호출)
		System.out.println("///////////////////////");
		System.out.println("원넓이(1)  둘레(2)");
		System.out.println("///////////////////////");

		System.out.println("메뉴번호>>");
		int type = sc.nextInt();

		System.out.println("원개수>>");
		len = sc.nextInt();
		double[] rads = new double[len];

		double areaResult = 0.0;
		double roundResult = 0.0;

		System.out.println("반지름>>");

		// --------------------------
		// 정수번호 선택인경우 switch
		switch (type) {
		case 1:
			for (int i = 0; i < rads.length; i++) {
				rads[i] = sc.nextDouble();
				areaResult += calArea(rads[i]);			
			}
			System.out.println(areaResult);
			break;

		case 2:
			for (int i = 0; i < rads.length; i++) {
				rads[i] = sc.nextDouble();				
				roundResult += calRound(rads[i]);
			}
			System.out.println(roundResult);
			break;
		default:
			break;
		}

		
		
		

	}

	public static double calArea(double r) {
		return r * r * 3.14;

	}

	public static double calRound(double r) {
		return 2 * r * 3.14;

	}
}
