package �㷨1_1ģ����߾���;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * ˼·������Խ��Խ��
Step1��
�ҵ���С��x,ʹsum=2+3+����+x>n,����������У���ans����ÿһ����
Step2:
��sum-n���Ϊno��ʣ�����ĳ˻����Ǵ𰸣����԰�ans����no
Step3:

����2~x,����Ϊno�������Ȼ�������ans
 */
//P1249 
public class ���˻�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		cin.close();
		if (n == 3) {
			System.out.println(1 + " " + 2);
			System.out.print(2);

		} else if (n == 4) {
			System.out.println(2 + " " + 2);
			System.out.println(4);
		} else {
			int sum = 0;
			int i = 2;
			BigInteger ans = new BigInteger("1");
			while (sum <= n) {
				sum += i;
				ans=ans.multiply(new BigInteger(String.valueOf(i)));
				i++;
			}
			int no = sum - n;
			if (no != 1) {
				ans=ans.divide(new BigInteger(String.valueOf(no)));
				if (no == 2) {
					for (int j = 3; j < i; j++) {
						if (j != i - 1) {
							System.out.print(j + " ");
						} else {
							System.out.print(j);
						}
					}
				} else if (no == i - 1) {
					System.out.print(2);
					for (int j = 3; j < i; j++) {
						if (j != i - 1) {
							System.out.print(j + " ");
						} else {
							System.out.print(j);
						}
					}
				} else {
					for (int j = 2; j < i; j++) {
						if (j != no) {
							if (j != i - 1) {
								System.out.print(j + " ");
							} else {
								System.out.print(j);
							}
						}
					}
				}
				System.out.println();
				System.out.println(ans);
			} else {
				ans=ans.divide(new BigInteger(String.valueOf(2))).divide(new BigInteger(String.valueOf(i-1))).multiply(new BigInteger(String.valueOf(i)));
				for (int j = 3; j <= i; j++) {
					if (j != i - 1) {
						System.out.print(j);
						if (j != i) {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
				System.out.print(ans);
			}
		}
	}
}
