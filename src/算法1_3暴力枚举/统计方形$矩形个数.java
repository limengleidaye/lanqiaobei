package 算法1_3暴力枚举;

import java.util.Scanner;
/*
 * 一、算正方形的个数

1.如果我们固定了正方形的右下角(i,j),你能不能算出此时可能的正方形的个数？

2.显然，此时答案为Min(i,j).

3.所以可以枚举右下角，计算此时答案，求和即可。

二、算长方形个数

1.其实算长方形并不常见，但算矩形大家应该经常遇到，所以如果你会算矩形，再联系第一个问题，那答案就转化为 矩形个数-正方形个数.

2.像求解正方形个数一样，固定矩形右下角(i,j),显然此时矩形个数为i*j.

3.同理，求和即可.
 */
//P2241 
public class 统计方形$矩形个数 {

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
