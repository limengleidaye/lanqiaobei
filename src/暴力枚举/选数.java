package 暴力枚举;

import java.util.Scanner;

//P1036 
public class 选数 {
	static int n, k;
	static int[] nums;
	static boolean used[];
	static int ans = 0;

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void DFS(int index, int i, int sum) {
		if (i == k) {
			if (isPrime(sum))
				ans++;
			return;
		}
		if (index == n)
			return;

		for (int j = index; j < n; j++) {
			if (!used[j]) {
				used[j] = true;
				DFS(j + 1, i + 1, sum + nums[j]);
				used[j] = false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		k = cin.nextInt();
		nums = new int[n];
		used = new boolean[n];
		for (int i = 0; i < n; i++) {
			nums[i] = cin.nextInt();
		}
		cin.close();
		DFS(0, 0, 0);
		System.out.println(ans);
	}

}
