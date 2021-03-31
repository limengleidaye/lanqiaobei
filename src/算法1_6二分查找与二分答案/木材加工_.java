package �㷨1_6���ֲ�������ִ�;

import java.util.Scanner;

//P2440 
public class ľ�ļӹ�_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int K = cin.nextInt();
		int[] wood = new int[N];
		//����Ҫ��rȡ����̵��Ǹ�
		int r = 1000000001;
		for (int i = 0; i < N; i++) {
			wood[i] = cin.nextInt();
		}
		cin.close();

		int l = 0;
		while (l < r) {
			int mid = (l + r) / 2;
			long ans = 0;
			for (int i = 0; i < N; i++) {
				ans += wood[i] / mid;
			}
			if (ans < K)
				r = mid;
			else
				l = mid + 1;
		}
		System.out.println(l - 1);
	}
}
