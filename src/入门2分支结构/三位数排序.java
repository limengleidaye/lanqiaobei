package 入门2分支结构;

import java.util.Arrays;
import java.util.Scanner;

public class 三位数排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int[] abc = new int[3];
		for (int i = 0; i < 3; i++) {
			abc[i] = cin.nextInt();
		}
		cin.close();
		Arrays.sort(abc);
		for (int i = 0; i < 3; i++) {
			System.out.print(abc[i]);
			if (i != 2)
				System.out.print(" ");
		}
	}

}
