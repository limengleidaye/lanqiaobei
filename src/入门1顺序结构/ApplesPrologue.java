package ����1˳��ṹ;

import java.util.Scanner;

//P5709 
//��β��ϲ����ƻ������������ m��ƻ��������һ��ƻ����Ҫ���� t ���ӣ�����һ�������̿�ʼ����һ��������ʱ���ȥ�� s���ӣ����������м���������ƻ����
public class ApplesPrologue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int t = cin.nextInt();
		int s = cin.nextInt();
		cin.close();
		if (t == 0)
			System.out.print(0);
		else if (s % t == 0) {
			System.out.print(Math.max(m - s / t, 0));
		} else {
			System.out.print(Math.max(m - s / t - 1, 0));
		}
	}

}
