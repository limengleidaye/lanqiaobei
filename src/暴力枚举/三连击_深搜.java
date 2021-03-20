package 暴力枚举;

import java.util.Scanner;

//P1618 
public class 三连击_深搜 {
	static int[] x = new int[9];
	static boolean[] used = new boolean[9];
	static int a;
	static int b;
	static int c;
	static boolean ans = false;

	public static int sum(int m) {// m为第几个数
		int sum = 0;
		for (int i = 3 * m - 3; i < 3 * m; i++) {
			sum *= 10;
			sum += x[i];
		}
		return sum;
	}

	public static void DFS(int n) {// deepSearch
		if (n == 9 && sum(1) * b == sum(2) * a && sum(1) * c == sum(3) * a) {
			System.out.println(sum(1) + " " + sum(2) + " " + sum(3));
			ans = true;
			return;
		}
		for (int i = 1; i <= 9; i++) {
			if (!used[i - 1]) {
				used[i - 1] = true;
				x[n] = i;
				DFS(n + 1);
				used[i - 1] = false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);
		a = cin.nextInt();
		b = cin.nextInt();
		c = cin.nextInt();
		cin.close();
		DFS(0);
		if (!ans)
			System.out.println("No!!!");
	}

}
