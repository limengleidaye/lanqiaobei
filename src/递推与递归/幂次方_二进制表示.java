package 递推与递归;

import java.util.Scanner;

//P1010 
public class 幂次方_二进制表示 {
	static int n;

	public static void powerPrint(int i) {
		if (i == 0) {
			return;
		}
		int j = 0;
		while (Math.pow(2, j + 1) <= i) {
			j++;
		}
		int re = (int) (i - Math.pow(2, j));
		//指数
		if (j == 0) {
			//如果指数为0
			System.out.print("2(0)");
		} else if (j == 1) {
			//如果指数为1
			System.out.print("2");
		} else {
			System.out.print("2(");
			powerPrint(j);
			System.out.print(")");
		}
		//余数
		if (re != 0)
			// *****************************
			System.out.print("+");
		// ***********************************
		powerPrint(re);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n = new Scanner(System.in).nextInt();
		powerPrint(n);
	}

}
