package 入门2分支结构;

import java.util.Scanner;

//P1909 
public class 买铅笔 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] p = new int[3][2];
		int res = 100000000;
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		for (int i = 0; i < 3; i++) {
			p[i][0] = cin.nextInt();
			p[i][1] = cin.nextInt();
		}

		cin.close();
		for (int i = 0; i < 3; i++) {
			double price = Math.ceil(n / (p[i][0] * 1.0)) * p[i][1];
			if (res > price) {
				res = (int) price;
			}
		}
		System.out.println(res);
	}

}
