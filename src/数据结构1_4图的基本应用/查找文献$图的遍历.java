package 数据结构1_4图的基本应用;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//P5318 
class Cmp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1 < o2 ? -1 : 1;
	}

}

public class 查找文献$图的遍历 {
	static boolean[] used = new boolean[100010];
	static int n, m;
	static ArrayList<Integer>[] G = new ArrayList[100010];

	static void dfs(int x, int cur) {
		// x当前节点，cur已访问过的节点
		if (cur == n) {
			return;
		}
		used[x] = true;
		System.out.print(x + " ");
		for (int i = 0; i < G[x].size(); i++) {
			if (!used[G[x].get(i)])
				dfs(G[x].get(i), cur++);
		}
	}

	static void bfs(int x) {
		for (int i = 1; i <= n; i++) {
			used[i] = false;
		}
		Queue<Integer> q = new LinkedList<>();
		used[x] = true;
		q.offer(x);
		while (!q.isEmpty()) {
			int peek = q.poll();
			System.out.print(peek + " ");
			for (int i = 0; i < G[peek].size(); i++) {
				if (!used[G[peek].get(i)]) {
					used[G[peek].get(i)] = true;
					q.offer(G[peek].get(i));
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		m = cin.nextInt();
		for (int i = 1; i <= n; i++) {
			// ArrayList Init
			G[i] = new ArrayList<>();
		}
		for (int i = 1; i <= m; i++) {
			int x = cin.nextInt();
			int y = cin.nextInt();
			G[x].add(y);
		}
		cin.close();
		for (int i = 1; i <= n; i++) {
			G[i].sort(new Cmp());
		}
		dfs(1, 0);
		System.out.println();
		bfs(1);
	}

}
