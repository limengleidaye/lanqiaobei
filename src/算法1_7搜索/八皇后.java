package �㷨1_7����;

import java.util.Scanner;

//P1219 
public class �˻ʺ� {
	static int n = 0;
	static int count = 0;
	static int[] ans;// �����кţ�ֵ�к�
	static boolean[] used;// �����кţ�ֵ�Ǹ����Ƿ���ֵ

	static void generateP(int index) {
		if (index == n) {
			count++;
			if (count <= 3) {
				for (int i = 0; i < n; i++) {
					System.out.print((ans[i] + 1) + " ");
				}
				System.out.println();
			}
			return;
		}
		for (int i = 0; i < n; i++) {// i���к�
			if (used[i] == false) {
				boolean flag = true;
				for (int j = 0; j < index; j++) {// j���к�
					// ��-��=��-��
					if (Math.abs(index - j) == Math.abs(i - ans[j]))
						flag = false;// ���в�����ʹ��
				}
				if (flag) {// ������п���ʹ��
					ans[index] = i;
					used[i] = true;
					generateP(index + 1);
					used[i] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n = new Scanner(System.in).nextInt();
		ans = new int[n];
		used = new boolean[n];
		generateP(0);
		System.out.println(count);
	}

}
