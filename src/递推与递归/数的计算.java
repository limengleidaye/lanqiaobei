package ������ݹ�;

import java.util.Scanner;

//P1028 
//���ѣ���ʱ
public class ���ļ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		cin.close();
		int[] ans = new int[n + 1];
		ans[0] = ans[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= i / 2; j++) {
				ans[i] += ans[j];
			}
		}
		System.out.println(ans[n]);
	}
}
