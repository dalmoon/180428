package method;

import java.util.Arrays;

//[1, 2, 3]- ++ ->[2, 3, 4]
//������ ���������� �Ѳ����� ���� �� ����(�Ѱ��� ����)�� �迭�� ��� 
public class MethodAddArray2 {
	// �Է� �Ű�����-> --ó�� -> ��� ���� -> ��� or ����
	// �޼ҵ�ȣ�⹮���� ���� (Ʈ����� �޼ҵ�)
	public static void mn(int[] su){
		m(su);		
		m(su);
		m(su);
		n(su);
	}

	public static void main(String[] args) {
		
		
		int[] su = { 1, 2, 3 };// new int[3];
		mn(su);	
	
		System.out.println("�����迭��� :" + Arrays.toString(su));
	}

	// 0. �Է� �Ű�����-> ++ó�� -> ��� ���� -> ��� or ����
	// public static m( ){}
	// 1. �迭�Ű����� arr
	// 5. ����Ÿ���� �迭�ڷ���[]
	public static int[] m(int[] arr) {

		// 3. ���迭��� 1++
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		} // 4. �迭���� ����
			// Arrays.toString(arr) : �迭��ҹ��ڿ�
		System.out.println("1������ : " +Arrays.toString(arr));
		return arr;

	}

	// �Է� �Ű�����-> --ó�� -> ��� ���� -> ��� or ����
	public static int[] n(int[] su) {
		for (int i = 0; i < su.length; i++) {
			su[i]--;
		}
		System.out.println("1������ : " + Arrays.toString(su));
		return su;
	}

}
