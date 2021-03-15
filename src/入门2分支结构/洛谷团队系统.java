package 入门2分支结构;

import java.util.Scanner;

//P5713 
public class 洛谷团队系统 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		cin.close();
		if (n * 5 < 3 * n + 11) {
			System.out.print("Local");
		} else
			System.out.print("Luogu");
	}

}
