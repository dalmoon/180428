package method;

import java.util.Scanner;

//�۾� (���� ���������)
//��� :������ ,������,�޴���ȣ ->  ������ ,�ѷ� ���� -> (���� ���������)) 
// �޴�
/*
 *������(1)  �ѷ�(2)  
 >>
 */
public class CircleCal4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int len = 0;
		//����� ���� ���� ��� = ����ڸ޴�=��ɾ�(���ȣ��)
		System.out.println("///////////////////////");
		System.out.println("������(1)  �ѷ�(2)");
		System.out.println("///////////////////////");

		System.out.println("�޴���ȣ>>");
		int type = sc.nextInt();

		System.out.println("������>>");
		len = sc.nextInt();
		double[] rads = new double[len];

		double areaResult = 0.0;
		double roundResult = 0.0;

		System.out.println("������>>");

		// --------------------------
		// ������ȣ �����ΰ�� switch
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
