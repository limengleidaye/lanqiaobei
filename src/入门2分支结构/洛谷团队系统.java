package ����2��֧�ṹ;

import java.util.Scanner;

//P5713 
public class ����Ŷ�ϵͳ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		cin.close();
		if (n * 5 < 3 * n + 11) {
			System.out.print("Local");
		} else
			System.out.print("Luogu");
	}

}
