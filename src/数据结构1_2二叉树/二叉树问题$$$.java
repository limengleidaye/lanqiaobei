package 数据结构1_2二叉树;

import java.util.Scanner;

//P3884 
public class 二叉树问题$$$ {
	static int[] fa = new int[101];
	static int[] depth = new int[101];
	static int[] width = new int[101];

	static int lca(int x, int y) {
		// ******************************
		// 最近公共祖先
		// ******************************
		if (x == y)
			return x;
		else if (depth[x] == depth[y])
			return lca(fa[x], fa[y]);
		else if (depth[x] > depth[y])
			return lca(fa[x], y);
		else
			return lca(x, fa[y]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();

		int[] root = new int[101];
		int[] son = new int[101];
		depth[1] = 1;
		for (int i = 1; i < n; i++) {
			root[i] = cin.nextInt();
			son[i] = cin.nextInt();
			depth[son[i]] = depth[root[i]] + 1;
			fa[son[i]] = root[i];
		}
		int x = cin.nextInt();
		int y = cin.nextInt();
		cin.close();
		int max_depth = 1;
		for (int i = 1; i <= n; i++) {
			max_depth = Math.max(max_depth, depth[i]);
			width[depth[i]]++;
		}
		int max_width = 1;
		for (int i = 1; i <= n; i++) {
			max_width = Math.max(max_width, width[i]);
		}
		System.out.println(max_depth);
		System.out.println(max_width);
		int k = lca(x, y);
		System.out.println(2 * (depth[x] - depth[k]) - depth[k] + depth[y]);
	}
}
