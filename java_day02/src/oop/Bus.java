package oop;

import java.util.*;

public class Bus {

	int pay = 0;
	int age = 1;

	public int getPay() {
		return pay;
	}

	public void setPay(int p) {

		System.out.println("�����̽ø� 1���� ī���̽ø� 2���� �����ּ���.");
		Scanner scanBill = new Scanner(System.in);
		int choise = scanBill.nextInt();

		if (choise == 1)
		{
			if (this.age < 7)
			{
				pay = 0;
			}

			else if (this.age < 13)
			{
				pay = 700;
			}

			else if (this.age < 20)
			{
				pay = 950;
			}

			else
				pay = 1150;
		}

		if (choise == 2)
		{
			if (this.age < 7)
			{
				pay = 0;
			}

			else if (this.age < 13)
			{
				pay = 600;
			}

			else if (this.age < 20)
			{
				pay = 850;
			}
			else
				pay = 1050;
		}

		
		
		System.out.println("������ݾ���" + pay + "�Դϴ�.");
		
	
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
