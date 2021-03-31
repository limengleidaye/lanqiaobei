package 算法1_7搜索;

import java.util.Scanner;

class Coo {
	int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

//P1433 
public class 吃奶酪 {
	static int n;
	static Coo[] coo;
	static boolean[] used;
	static double ans = 10000000;

	static double distance(int a, int b) {
		return Math.sqrt(Math.pow(coo[a].getX() - coo[b].getX(), 2) + Math.pow(coo[a].getY() - coo[b].getY(), 2));
	}

	static void DFS(int index, int now, double dis) {
		// index:到过的个数 now:当前点的坐标 dis:距离
		if (index == n) {
			ans = Math.min(ans, dis);
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (!used[i]) {
				if (dis + distance(now, i) > ans)
					return;
				used[i] = true;
				DFS(index + 1, i, dis + distance(now, i));
				used[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		used = new boolean[n + 1];
		coo = new Coo[n + 1];
		coo[0] = new Coo();
		coo[0].setX(0);
		coo[0].setY(0);
		used[0] = true;
		for (int i = 1; i <= n; i++) {
			coo[i] = new Coo();
			coo[i].setX(cin.nextInt());
			coo[i].setY(cin.nextInt());
		}
		cin.close();
		DFS(0, 0, 0);
		System.out.printf("%.2f", ans);
	}

}
