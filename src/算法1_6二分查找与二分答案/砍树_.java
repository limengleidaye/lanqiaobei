package 算法1_6二分查找与二分答案;

import java.util.Scanner;

//P1873 
public class 砍树_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int M = cin.nextInt();
		long[] trees = new long[N];
		long r = 0;
		for (int i = 0; i < N; i++) {
			trees[i] = cin.nextLong();
			r = Math.max(r, trees[i]);
		}
		cin.close();
		long l = 0;
		while (l < r) {
			long mid = (l + r) / 2;
			long ans = 0;
			for (int i = 0; i < N; i++) {
				if (trees[i] > mid)
					ans += trees[i] - mid;
			}
			if (ans < M)
				r = mid;
			else
				l = mid + 1;
		}
		System.out.println(l - 1);
	}

}
