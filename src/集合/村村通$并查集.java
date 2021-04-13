package 集合;

import java.util.Scanner;

public class 村村通$并查集 {
	static int[] father = new int[1010];

	static int find(int x) {// 并查集(路径压缩)
		if (x != father[x]) {
			father[x] = find(father[x]);
		}
		return father[x];
	}

	static void union(int x, int y) {
		int fa1 = find(x);
		int fa2 = find(y);
		father[fa1] = fa2;// 祖先和祖先结为父子(谁是父亲谁是儿子都可以)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (true) {
			int ans = 0;
			int n = cin.nextInt();
			if (n == 0)
				break;
			int m = cin.nextInt();
			for (int i = 1; i <= n; i++) {
				father[i] = i;
			}
			for (int i = 1; i <= m; i++) {
				int x = cin.nextInt();
				int y = cin.nextInt();
				union(x, y);
			}
			for (int i = 1; i <= n; i++) {
				if (find(i) == i)
					ans++;
			}
			System.out.println(ans - 1);
		}
		cin.close();
	}
}
