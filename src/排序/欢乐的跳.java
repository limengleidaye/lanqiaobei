package ÅÅĞò;

import java.util.Scanner;
import java.util.TreeSet;

//P1152 
public class »¶ÀÖµÄÌø {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = cin.nextInt();
		}
		TreeSet<Long> tree = new TreeSet<>();
		cin.close();
		for (int i = 1; i < n; i++) {
			long tem = Math.abs(a[i] - a[i - 1]);
			tree.add(tem);
		}
		if (tree.last() == tree.size()) {
			System.out.println("Jolly");
		} else
			System.out.println("Not jolly");
	}
}