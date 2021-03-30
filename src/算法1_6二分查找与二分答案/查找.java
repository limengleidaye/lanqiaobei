package 算法1_6二分查找与二分答案;

import java.util.Scanner;

//P2249 
public class 查找 {
	public static int find(int x, int[] a) {// 二分查找
		int l = 0, r = a.length - 1;
		while (l < r) {
			int mid = (l + r) / 2;
			if (a[mid] >= x)
				r = mid;
			else
				l = mid + 1;// *********************************
		}
		if (a[l] == x)
			return l + 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = cin.nextInt();
		}
		for (int i = 0; i < m; i++) {
			int q = cin.nextInt();
			System.out.print(find(q, a) + " ");
		}
		cin.close();
	}

}
