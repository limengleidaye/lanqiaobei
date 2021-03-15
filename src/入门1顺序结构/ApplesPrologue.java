package 入门1顺序结构;

import java.util.Scanner;

//P5709 
//八尾勇喜欢吃苹果。她现在有 m个苹果，吃完一个苹果需要花费 t 分钟，吃完一个后立刻开始吃下一个。现在时间过去了 s分钟，请问她还有几个完整的苹果？
public class ApplesPrologue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int t = cin.nextInt();
		int s = cin.nextInt();
		cin.close();
		if (t == 0)
			System.out.print(0);
		else if (s % t == 0) {
			System.out.print(Math.max(m - s / t, 0));
		} else {
			System.out.print(Math.max(m - s / t - 1, 0));
		}
	}

}
