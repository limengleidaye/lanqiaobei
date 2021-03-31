package �㷨1_7����;

import java.util.Scanner;

public class ��ֵĵ��� {
	static int N, A, B, ans = 10000000;
	static boolean[] used;//�ж��Ƿ�ɵ���
	static int[] k;

	static void DFS(int index, int times) {
		if (index == B) {
			if (times < ans)
				ans = times;
			return;
		}
		for (int i = -1; i <= 1; i += 2) {// ���򡪡�-1���£�1����
			if (index + i * k[index] >= 0 && index + i * k[index] < N) {
				if (used[index + i * k[index]] == false) {
					used[index + i * k[index]] = true;
					DFS(index + i * k[index], times + 1);
					used[index + i * k[index]] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		N = cin.nextInt();
		used = new boolean[N];
		k = new int[N];
		A = cin.nextInt() - 1;
		B = cin.nextInt() - 1;

		for (int i = 0; i < N; i++) {
			k[i] = cin.nextInt();
		}
		cin.close();
		used[A] = true;
		DFS(A, 0);
		if (ans != 10000000)
			System.out.println(ans);
		else
			System.out.println(-1);
	}

}
