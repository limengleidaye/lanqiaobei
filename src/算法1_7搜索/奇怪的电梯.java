package 算法1_7搜索;

import java.util.Scanner;

public class 奇怪的电梯 {
	static int N, A, B, ans = 10000000;
	static boolean[] used;//判断是否可到达
	static int[] k;

	static void DFS(int index, int times) {
		if (index == B) {
			if (times < ans)
				ans = times;
			return;
		}
		for (int i = -1; i <= 1; i += 2) {// 方向——-1：下，1：上
			if (index + i * k[index] >= 0 && index + i * k[index] < N) {
				if (used[index + i * k[index]] == false) {
					used[index + i * k[index]] = true;
					DFS(index + i * k[index], times + 1);
					used[index + i * k[index]] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		N = cin.nextInt();
		used = new boolean[N];
		k = new int[N];
		A = cin.nextInt() - 1;
		B = cin.nextInt() - 1;

		for (int i = 0; i < N; i++) {
			k[i] = cin.nextInt();
		}
		cin.close();
		used[A] = true;
		DFS(A, 0);
		if (ans != 10000000)
			System.out.println(ans);
		else
			System.out.println(-1);
	}

}
