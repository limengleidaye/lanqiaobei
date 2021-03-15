package 入门1顺序结构;

import java.util.Scanner;

//P1425
//这一天，小鱼给自己的游泳时间做了精确的计时（本题中的计时都按24小时制计算），它发现自己从a时b分一直游泳到当天的c时d分，请你帮小鱼计算一下，它这天一共游了多少时间呢？
public class 小鱼的游泳时间 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		int d = cin.nextInt();
		int hour = c - a;
		int min = d - b;
		if (min < 0) {
			hour -= 1;
			min += 60;
		}
		System.out.print(hour + " " + min);
	}

}
