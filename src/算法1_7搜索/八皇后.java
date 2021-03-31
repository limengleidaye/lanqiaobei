package 算法1_7搜索;

import java.util.Scanner;

//P1219 
public class 八皇后 {
	static int n = 0;
	static int count = 0;
	static int[] ans;// 索引行号，值列号
	static boolean[] used;// 索引列号，值是该列是否有值

	static void generateP(int index) {
		if (index == n) {
			count++;
			if (count <= 3) {
				for (int i = 0; i < n; i++) {
					System.out.print((ans[i] + 1) + " ");
				}
				System.out.println();
			}
			return;
		}
		for (int i = 0; i < n; i++) {// i是列号
			if (used[i] == false) {
				boolean flag = true;
				for (int j = 0; j < index; j++) {// j是行号
					// 行-行=列-列
					if (Math.abs(index - j) == Math.abs(i - ans[j]))
						flag = false;// 该列不可以使用
				}
				if (flag) {// 如果该列可以使用
					ans[index] = i;
					used[i] = true;
					generateP(index + 1);
					used[i] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n = new Scanner(System.in).nextInt();
		ans = new int[n];
		used = new boolean[n];
		generateP(0);
		System.out.println(count);
	}

}
