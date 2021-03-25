package 算法1_2排序;

import java.util.Scanner;

//P1923 
public class 求第k小的数_分治算法 {
	static int[] ai;

	public static int quickSort(int left, int right) {
		int mid = ai[left];
		while (left < right) {
			while (left < right && mid <= ai[right])
				right--;
			ai[left] = ai[right];
			while (left < right && mid >= ai[left])
				left++;
			ai[right] = ai[left];
		}
		ai[left] = mid;
		return left;
	}

	public static void find(int left, int right, int k) {
		int tem = quickSort(left, right);
		if (tem == k)
			System.out.println(ai[k]);
		else if (k < tem) {
			find(left, tem - 1, k);
		} else {
			find(tem + 1, right, k);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int k = cin.nextInt();
		ai = new int[n];
		for (int i = 0; i < n; i++) {
			ai[i] = cin.nextInt();
		}
		find(0, n - 1, k);
	}

}
