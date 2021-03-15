package 入门2分支结构;

import java.util.Scanner;

//P5712 
public class Apples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int x = cin.nextInt();
		cin.close();
		if (x == 1 || x == 0) {
			System.out.print("Today, I ate " + x + " apple.");
		} else {
			System.out.print("Today, I ate " + x + " apples.");
		}
	}

}
