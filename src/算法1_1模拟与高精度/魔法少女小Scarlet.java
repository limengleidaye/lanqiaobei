package 算法1_1模拟与高精度;

import java.util.Scanner;

//P4924 
public class 魔法少女小Scarlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[][] nums = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				nums[i][j] = i * n + j + 1;
		int m = cin.nextInt();
		for(int i=0;i<m;i++) {
			
		}
		cin.close();
	}

}
