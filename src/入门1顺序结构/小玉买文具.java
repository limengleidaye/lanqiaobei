package ����1˳��ṹ;

import java.util.Scanner;

//P1421 
//�����θ�С��һ�����񣬵��ľߵ����������ǩ�ֱʡ���֪һֻǩ�ֱʵļ۸��� 111 Ԫ 999 �ǣ��������θ�С���Ǯ�� aaa Ԫ bbb �ǣ�С����֪����������������ֻǩ�ֱ��ء�

public class С�����ľ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		cin.close();
		double money = a + b * 0.1;
		System.out.print((int) (money / 1.9));
	}

}
