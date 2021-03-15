package 入门2分支结构;

import java.util.Scanner;

//P5711 
//输入一个年份（大于 1582 的整数 ），判断这一年是否是闰年，如果是输出 1，否则输出 0。
public class 闰年判断 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int year = cin.nextInt();
		cin.close();
		if (year % 4 == 0 && year % 100 != 0)
			System.out.print(1);
		else if (year % 100 == 0 && year % 400 == 0)
			System.out.print(1);
		else
			System.out.print(0);
	}

}
