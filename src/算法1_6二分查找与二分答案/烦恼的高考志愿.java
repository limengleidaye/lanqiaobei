package �㷨1_6���ֲ�������ִ�;

import java.util.Arrays;
import java.util.Scanner;

//P1678 
public class ���յĸ߿�־Ը {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int n = cin.nextInt();
		int[] scores = new int[m];
		for (int i = 0; i < m; i++) {
			scores[i] = cin.nextInt();
		}
		Arrays.sort(scores);
		long ans = 0;
		for (int i = 0; i < n; i++) {
			int x = cin.nextInt();
			int l = 0;
			int r = m - 1;
			while (l < r) {
				int mid = (l + r) / 2;
				if (scores[mid] >= x)
					r = mid;
				else
					l = mid + 1;
			}
			if (l == 0)
				ans += scores[l] - x;//����ı���С�Ļ�С
			else
				//����ı����Ļ���
				ans += Math.min(Math.abs(x - scores[l - 1]), Math.abs(scores[l] - x));
		}
		cin.close();
		System.out.println(ans);
	}
}
