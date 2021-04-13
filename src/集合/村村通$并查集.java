package ����;

import java.util.Scanner;

public class ���ͨ$���鼯 {
	static int[] father = new int[1010];

	static int find(int x) {// ���鼯(·��ѹ��)
		if (x != father[x]) {
			father[x] = find(father[x]);
		}
		return father[x];
	}

	static void union(int x, int y) {
		int fa1 = find(x);
		int fa2 = find(y);
		father[fa1] = fa2;// ���Ⱥ����Ƚ�Ϊ����(˭�Ǹ���˭�Ƕ��Ӷ�����)
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
