package ����1˳��ṹ;

import java.util.Scanner;

//P2181 
public class �Խ���_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		long n = cin.nextLong();
		cin.close();
		System.out.print(n * (n - 1) / 2 * (n - 2) / 3 * (n - 3) / 4);
	}
}
