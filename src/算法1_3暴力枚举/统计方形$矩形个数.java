package �㷨1_3����ö��;

import java.util.Scanner;
/*
 * һ���������εĸ���

1.������ǹ̶��������ε����½�(i,j),���ܲ��������ʱ���ܵ������εĸ�����

2.��Ȼ����ʱ��ΪMin(i,j).

3.���Կ���ö�����½ǣ������ʱ�𰸣���ͼ��ɡ�

�����㳤���θ���

1.��ʵ�㳤���β���������������δ��Ӧ�þ�����������������������Σ�����ϵ��һ�����⣬�Ǵ𰸾�ת��Ϊ ���θ���-�����θ���.

2.����������θ���һ�����̶��������½�(i,j),��Ȼ��ʱ���θ���Ϊi*j.

3.ͬ����ͼ���.
 */
//P2241 
public class ͳ�Ʒ���$���θ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		cin.close();
		long square = 0;
		long rec = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				square += Math.min(i, j);
				rec += i * j;
			}
		}
		System.out.println(square + " " + (rec - square));
	}

}
