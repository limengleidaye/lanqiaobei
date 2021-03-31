package 数据结构1_1线性表;

import java.util.LinkedList;
import java.util.Scanner;

//P1160 
public class 队列安排 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		LinkedList<Integer> arr = new LinkedList<>();
		arr.add(1);
		for (int i = 2; i <= N; i++) {
			int index = arr.indexOf(cin.nextInt());
			int p = cin.nextInt();
			if (p == 0)
				arr.add(index, i);
			else
				arr.add(index + 1, i);
		}
		int M = cin.nextInt();
		for (int i = 0; i < M; i++) {
			int num = cin.nextInt();
			if (arr.contains(num)) {
				arr.remove(arr.indexOf(num));
			}
		}
		cin.close();
		for (int i : arr)
			System.out.print(i + " ");
	}
}
