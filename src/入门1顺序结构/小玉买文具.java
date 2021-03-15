package 入门1顺序结构;

import java.util.Scanner;

//P1421 
//班主任给小玉一个任务，到文具店里买尽量多的签字笔。已知一只签字笔的价格是 111 元 999 角，而班主任给小玉的钱是 aaa 元 bbb 角，小玉想知道，她最多能买多少只签字笔呢。

public class 小玉买文具 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		cin.close();
		double money = a + b * 0.1;
		System.out.print((int) (money / 1.9));
	}

}
