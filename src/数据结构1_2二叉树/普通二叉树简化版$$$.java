package 数据结构1_2二叉树;

import java.util.Scanner;

//P5076 
//BST二叉搜索树
class Node__ {
	int val, ls, rs, cnt, siz;

	Node__() {
		ls = 0;
		rs = 0;
		cnt = 0;
		siz = 0;
	}

	// val 是权值，ls / rs 是左/右 孩子的下标，cnt 是当前的权值出现了几次，siz 是子树大小和自己的大小的和。
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public int getRs() {
		return rs;
	}

	public void setRs(int rs) {
		this.rs = rs;
	}

	public int getLs() {
		return ls;
	}

	public void setLs(int ls) {
		this.ls = ls;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getSiz() {
		return siz;
	}

	public void setSiz(int siz) {
		this.siz = siz;
	}

}

public class 普通二叉树简化版$$$ {
	static int count = 0;// 树的总节点数
	static Node__[] tree = new Node__[50010];

	static void add(int x, int v) {
		tree[x].siz++;
		if (tree[x].getVal() == v) {
			tree[x].cnt++;
			return;
		}
		if (tree[x].getVal() > v) {
			// 节点大于v，向左子树插入
			if (tree[x].getLs() != 0) {
				// 存在左子树
				add(tree[x].getLs(), v);
			} else {
				count++;
				tree[count] = new Node__();
				tree[count].setVal(v);
				tree[count].setSiz(1);
				tree[count].setCnt(1);
				tree[x].setLs(count);
			}
		} else {// 节点小于v，向右子树插入
			if (tree[x].getRs() != 0) {
				add(tree[x].getRs(), v);
			} else {
				count++;
				tree[count] = new Node__();
				tree[count].setVal(v);
				tree[count].setSiz(1);
				tree[count].setCnt(1);
				tree[x].setRs(count);
			}
		}
	}

	static int queryfr(int x, int val, int ans) {
		// x 是当前的节点的下标，val 是要找前驱的值，ans 是目前找到的比 valvalval 小的数的最大值。
		if (tree[x].getVal() >= val) {
			// 如果当前值大于val，就说明查的数大了，所以要往左子树找
			if (tree[x].getLs() == 0) {
				// 如果没有左子树就直接返回找到的ans
				return ans;
			} else {
				return queryfr(tree[x].getLs(), val, ans);
			}
		} else {
			if (tree[x].getRs() == 0) {
				// 如果没有右节点
				return tree[x].getVal() < val ? tree[x].getVal() : ans;
			} else if (tree[x].getCnt() > 0) {
				// 如果当前节数的个数不为0，ans就可以更新为tree[x].val
				// *****************************
				return queryfr(tree[x].getRs(), val, tree[x].getVal());
				// *******************************
			} else {
				// 反之ans不需要更新
				return queryfr(tree[x].getRs(), val, ans);
			}
		}
	}

	static int queryne(int x, int val, int ans) {
		if (tree[x].getVal() <= val) {
			if (tree[x].getRs() == 0) {
				return ans;
			} else {
				return queryne(tree[x].getRs(), val, ans);
			}
		} else {
			if (tree[x].getLs() == 0) {
				return tree[x].getVal() > val ? tree[x].getVal() : ans;
			} else if (tree[x].getCnt() != 0) {
				return queryne(tree[x].getLs(), val, tree[x].getVal());
			} else {
				return queryne(tree[x].getLs(), val, ans);
			}
		}
	}

	static int queryval(int x, int val) {
		if (x == 0)
			return 0;
		else if (tree[x].getVal() == val)
			return tree[tree[x].getLs()].getSiz();
		else if (tree[x].getVal() > val)
			return queryval(tree[x].getLs(), val);
		else
			// 如果当前节点值比val小了，我们就去它的右子树找val，同时加上左子树的大小和这个节点的值出现次数
			return queryval(tree[x].getRs(), val) + tree[tree[x].getLs()].getSiz() + tree[x].getCnt();
	}

	static int queryrk(int x, int rk) {
		if (x == 0)
			return Integer.MAX_VALUE;
		if (tree[tree[x].getLs()].getSiz() >= rk) {
			// 如果左子树大小>=rk了，就说明答案在左子树里
			return queryrk(tree[x].getLs(), rk);
		} else if (tree[tree[x].getLs()].getSiz() + tree[x].getCnt() >= rk) {
			// 如果左子树大小加上当前的数的多少恰好>=k，说明我们找到答案了
			return tree[x].getVal();
		} else {
			// 否则就查右子树，同时减去当前节点的次数与左子树的大小
			return queryrk(tree[x].getRs(), rk - tree[tree[x].getLs()].getSiz() - tree[x].getCnt());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		tree[0] = new Node__();
		int n = cin.nextInt();
		while (n-- > 0) {
			int opt = cin.nextInt();
			int val = cin.nextInt();
			if (opt == 1)
				System.out.println(queryval(1, val) + 1);
			else if (opt == 2)
				System.out.println(queryrk(1, val));
			else if (opt == 3)
				System.out.println(queryfr(1, val, Integer.MIN_VALUE));
			else if (opt == 4)
				System.out.println(queryne(1, val, Integer.MAX_VALUE));
			else {
				if (count == 0) {
					count++;
					tree[count] = new Node__();
					tree[count].setCnt(1);
					tree[count].setSiz(1);
					tree[count].setVal(val);
				} else
					add(1, val);
			}
		}
		cin.close();
	}

}
