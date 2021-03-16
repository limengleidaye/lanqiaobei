package 算法1_1模拟与高精度;

import java.util.Scanner;

//P4924 

public class 魔法少女小Scarlet_矩阵旋转 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[][] nums = new int[n][n];
		int[][] temp = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				nums[i][j] = i * n + j + 1;
		int m = cin.nextInt();
		for (int x = 0; x < m; x++) {
			int a = cin.nextInt() - 1;
			int b = cin.nextInt() - 1;
			int r = cin.nextInt();
			int opt = cin.nextInt();

			if (opt == 0) {
				// 顺时针
				for (int i = a - r; i <= a + r; i++) {
					for (int j = b - r; j <= b + r; j++) {
						temp[a - b + j][b + a - i] = nums[i][j];
					}
				}
				for (int i = a - r; i <= a + r; i++) {
					for (int j = b - r; j <= b + r; j++) {
						nums[i][j] = temp[i][j];
					}
				}
			} else {
				// 逆时针
				for (int i = a - r; i <= a + r; i++) {
					for (int j = b - r; j <= b + r; j++) {
						temp[a + b - j][b - a + i] = nums[i][j];
					}
				}
				for (int i = a - r; i <= a + r; i++) {
					for (int j = b - r; j <= b + r; j++) {
						nums[i][j] = temp[i][j];
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(nums[i][j]);
				if (j != n - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
		cin.close();
	}

}
