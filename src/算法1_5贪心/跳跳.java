package Ëã·¨1_5Ì°ĞÄ;

import java.util.Arrays;
import java.util.Scanner;

//P4995 
public class ÌøÌø {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = cin.nextInt();
		}
		cin.close();
		Arrays.sort(h);
		long ans = 0;
		ans += Math.pow(h[n - 1], 2);
		int i = 0, j = n - 1;
		while (i < j) {
			ans += Math.pow(h[i] - h[j--], 2);
			ans += Math.pow(h[i++] - h[j], 2);
		}
		System.out.println(ans);
	}
}
