package 算法1_2排序;

import java.util.Scanner;

//P1116 
public class 车厢重组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = cin.nextInt();
		}
		cin.close();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (nums[j - 1] > nums[j]) {
					int tem = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = tem;
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
