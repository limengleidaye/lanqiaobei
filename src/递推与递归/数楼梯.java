package µÝÍÆÓëµÝ¹é;

import java.math.BigInteger;
import java.util.Scanner;

//P1255 
public class ÊýÂ¥ÌÝ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger[] step = new BigInteger[5001];
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		cin.close();
		if (n == 0) {
			System.out.println(0);
		} else {
			step[0] = step[1] = new BigInteger("1");
			for (int i = 2; i <= n; i++) {
				step[i] = step[i - 1].add(step[i - 2]);
			}
			System.out.println(step[n]);
		}
	}

}
