package 算法1_1模拟与高精度;

import java.math.BigInteger;
import java.util.Scanner;

public class AMulBProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		BigInteger a = cin.nextBigInteger();
		BigInteger b = cin.nextBigInteger();
		cin.close();
		System.out.println(a.multiply(b));
	}

}
