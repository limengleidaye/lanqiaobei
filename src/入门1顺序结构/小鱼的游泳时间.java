package ����1˳��ṹ;

import java.util.Scanner;

//P1425
//��һ�죬С����Լ�����Ӿʱ�����˾�ȷ�ļ�ʱ�������еļ�ʱ����24Сʱ�Ƽ��㣩���������Լ���aʱb��һֱ��Ӿ�������cʱd�֣������С�����һ�£�������һ�����˶���ʱ���أ�
public class С�����Ӿʱ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		int d = cin.nextInt();
		int hour = c - a;
		int min = d - b;
		if (min < 0) {
			hour -= 1;
			min += 60;
		}
		System.out.print(hour + " " + min);
	}

}
