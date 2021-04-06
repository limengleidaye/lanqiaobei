package 数据结构1_2二叉树;

import java.util.Arrays;
import java.util.Scanner;

class Node implements Comparable<Node> {
	int num, id;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return this.num > o.getNum() ? -1 : 1;
	}

}

public class 淘汰赛 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = (int) Math.pow(2, cin.nextInt());
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) {
			nodes[i] = new Node();
			nodes[i].setId(i + 1);
			nodes[i].setNum(cin.nextInt());
		}
		cin.close();
		Arrays.sort(nodes, 0, n / 2);
		Arrays.sort(nodes, n / 2, n);
		System.out.println(nodes[0].getNum() > nodes[n / 2].getNum() ? nodes[n / 2].getId() : nodes[0].getId());
	}

}
