package 算法1_1模拟与高精度;

import java.util.Scanner;

//P1042 
public class 乒乓球 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int WNums = 0;
		int LNums = 0;
		String lets = "";
		while (true) {
			lets += cin.next();
			if (lets.contains("E"))
				break;
		}
		cin.close();
		for (int i = 0; i < lets.length(); i++) {
			if (lets.charAt(i) == 'W') {
				WNums++;
				if (WNums >= 11 && (WNums - LNums) >= 2) {
					System.out.println(WNums + ":" + LNums);
					WNums = 0;
					LNums = 0;
				}
			} else if (lets.charAt(i) == 'L') {
				LNums++;
				if (LNums >= 11 && (LNums - WNums) >= 2) {
					System.out.println(WNums + ":" + LNums);
					WNums = 0;
					LNums = 0;
				}
			} else {
				System.out.println(WNums + ":" + LNums);
				WNums = 0;
				LNums = 0;
				break;
			}
		}
		System.out.println();
		for (int i = 0; i < lets.length(); i++) {
			if (lets.charAt(i) == 'W') {
				WNums++;
				if (WNums >= 21 && (WNums - LNums) >= 2) {
					System.out.println(WNums + ":" + LNums);
					WNums = 0;
					LNums = 0;
				}
			} else if (lets.charAt(i) == 'L') {
				LNums++;
				if (LNums >= 21 && (LNums - WNums) >= 2) {
					System.out.println(WNums + ":" + LNums);
					WNums = 0;
					LNums = 0;
				}
			} else {
				System.out.println(WNums + ":" + LNums);
				break;
			}
		}
	}
}
