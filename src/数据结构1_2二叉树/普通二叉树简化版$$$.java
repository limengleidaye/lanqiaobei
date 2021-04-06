package ���ݽṹ1_2������;

import java.util.Scanner;

//P5076 
//BST����������
class Node__ {
	int val, ls, rs, cnt, siz;

	Node__() {
		ls = 0;
		rs = 0;
		cnt = 0;
		siz = 0;
	}

	// val ��Ȩֵ��ls / rs ����/�� ���ӵ��±꣬cnt �ǵ�ǰ��Ȩֵ�����˼��Σ�siz ��������С���Լ��Ĵ�С�ĺ͡�
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

public class ��ͨ�������򻯰�$$$ {
	static int count = 0;// �����ܽڵ���
	static Node__[] tree = new Node__[50010];

	static void add(int x, int v) {
		tree[x].siz++;
		if (tree[x].getVal() == v) {
			tree[x].cnt++;
			return;
		}
		if (tree[x].getVal() > v) {
			// �ڵ����v��������������
			if (tree[x].getLs() != 0) {
				// ����������
				add(tree[x].getLs(), v);
			} else {
				count++;
				tree[count] = new Node__();
				tree[count].setVal(v);
				tree[count].setSiz(1);
				tree[count].setCnt(1);
				tree[x].setLs(count);
			}
		} else {// �ڵ�С��v��������������
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
		// x �ǵ�ǰ�Ľڵ���±꣬val ��Ҫ��ǰ����ֵ��ans ��Ŀǰ�ҵ��ı� valvalval С���������ֵ��
		if (tree[x].getVal() >= val) {
			// �����ǰֵ����val����˵����������ˣ�����Ҫ����������
			if (tree[x].getLs() == 0) {
				// ���û����������ֱ�ӷ����ҵ���ans
				return ans;
			} else {
				return queryfr(tree[x].getLs(), val, ans);
			}
		} else {
			if (tree[x].getRs() == 0) {
				// ���û���ҽڵ�
				return tree[x].getVal() < val ? tree[x].getVal() : ans;
			} else if (tree[x].getCnt() > 0) {
				// �����ǰ�����ĸ�����Ϊ0��ans�Ϳ��Ը���Ϊtree[x].val
				// *****************************
				return queryfr(tree[x].getRs(), val, tree[x].getVal());
				// *******************************
			} else {
				// ��֮ans����Ҫ����
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
			// �����ǰ�ڵ�ֵ��valС�ˣ����Ǿ�ȥ������������val��ͬʱ�����������Ĵ�С������ڵ��ֵ���ִ���
			return queryval(tree[x].getRs(), val) + tree[tree[x].getLs()].getSiz() + tree[x].getCnt();
	}

	static int queryrk(int x, int rk) {
		if (x == 0)
			return Integer.MAX_VALUE;
		if (tree[tree[x].getLs()].getSiz() >= rk) {
			// �����������С>=rk�ˣ���˵��������������
			return queryrk(tree[x].getLs(), rk);
		} else if (tree[tree[x].getLs()].getSiz() + tree[x].getCnt() >= rk) {
			// �����������С���ϵ�ǰ�����Ķ���ǡ��>=k��˵�������ҵ�����
			return tree[x].getVal();
		} else {
			// ����Ͳ���������ͬʱ��ȥ��ǰ�ڵ�Ĵ������������Ĵ�С
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
