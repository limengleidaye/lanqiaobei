package 算法1_1模拟与高精度;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 思路：乘数越多越好
Step1：
找到最小的x,使sum=2+3+……+x>n,并在这过程中，把ans乘上每一个数
Step2:
把sum-n标记为no，剩下数的乘积就是答案，所以把ans除以no
Step3:

遍历2~x,若不为no就输出，然后换行输出ans
 */
//P1249 
public class 最大乘积_数论 {

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
