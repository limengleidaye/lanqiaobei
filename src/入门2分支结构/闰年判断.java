package ����2��֧�ṹ;

import java.util.Scanner;

//P5711 
//����һ����ݣ����� 1582 ������ �����ж���һ���Ƿ������꣬�������� 1��������� 0��
public class �����ж� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int year = cin.nextInt();
		cin.close();
		if (year % 4 == 0 && year % 100 != 0)
			System.out.print(1);
		else if (year % 100 == 0 && year % 400 == 0)
			System.out.print(1);
		else
			System.out.print(0);
	}

}
