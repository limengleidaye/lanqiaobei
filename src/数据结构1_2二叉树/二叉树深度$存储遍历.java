package 数据结构1_2二叉树;

import java.util.Scanner;

//P4913 
class Node_ {
	int l, r;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
}

public class 二叉树深度$存储遍历 {
	static int ans = -1;
	
	static Node_[] tree = new Node_[10000000];

	static void dfs(int index, int depth) {
		if (index == 0) {
			ans = Math.max(depth - 1, ans);
			return;
		}
		dfs(tree[index].getL(), depth + 1);
		dfs(tree[index].getR(), depth + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		for (int i = 1; i <= n; i++) {
			tree[i] = new Node_();
			tree[i].setL(cin.nextInt());
			tree[i].setR(cin.nextInt());
		}
		dfs(1, 1);
		System.out.println(ans);
	}

}
