package 算法1_4递推与递归;

import java.util.Scanner;

//P1259 
public class 黑白棋子的移动_打表 {
	static char[] ch;

	public static void swap(int start, int end) {
		char temp = ch[start];
		ch[start] = ch[end];
		ch[end] = temp;
	}

	public static void print() {
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}

	public static void movie(int start, int end) {
		swap(start, end);
		swap(start + 1, end + 1);
		print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new Scanner(System.in).nextInt();
		ch = new char[2 * n + 2];
		for (int i = 0; i < n; i++) {
			ch[i] = 'o';
			ch[i + n] = '*';
		}
		ch[2 * n] = ch[2 * n + 1] = '-';
		print();
		int index = n - 1;
		while (true) {
			movie(index, 2 * index + 2);
			index--;
			if (index == 2)
				break;
			movie(index + 1, 2 * index + 2);
		}
		String[] out = { "ooo*o**--*", "o--*o**oo*", "o*o*o*--o*", "--o*o*o*o*" };
		String s = "";
		for (int i = 0; i < n - 4; i++) {
			s += "o*";
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(out[i] + s);
		}
	}
}
