package 算法1_4递推与递归;

import java.util.Scanner;

//P1044 
public class 栈_递推 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ans = new int[19][19];
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		cin.close();
		for (int i = 0; i <= n; i++) {
			ans[0][i] = 1;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				if (i == j)
					ans[i][j] = ans[i - 1][j];
				else
					ans[i][j] = ans[i - 1][j] + ans[i][j - 1];
			}
		}
		System.out.println(ans[n][n]);
	}

}
