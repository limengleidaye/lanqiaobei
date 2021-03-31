package 算法1_6二分查找与二分答案;

import java.util.Scanner;

//P2440 
public class 木材加工_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int K = cin.nextInt();
		int[] wood = new int[N];
		//不需要让r取到最短的那个
		int r = 1000000001;
		for (int i = 0; i < N; i++) {
			wood[i] = cin.nextInt();
		}
		cin.close();

		int l = 0;
		while (l < r) {
			int mid = (l + r) / 2;
			long ans = 0;
			for (int i = 0; i < N; i++) {
				ans += wood[i] / mid;
			}
			if (ans < K)
				r = mid;
			else
				l = mid + 1;
		}
		System.out.println(l - 1);
	}
}
