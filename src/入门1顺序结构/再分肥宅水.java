package 入门1顺序结构;

import java.util.Scanner;

//P5706
//现在有 t 毫升肥宅快乐水，要均分给 n 名同学。每名同学需要 2 个杯子。现在想知道每名同学可以获得多少毫升饮料（严格精确到小数点后 3 位），以及一共需要多少个杯子。输入一个实数 t 和一个整数 n，使用空格隔开。输出两个数字表示答案，使用换行隔开。
public class 再分肥宅水 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		float volumn = cin.nextFloat();
		int n = cin.nextInt();
		System.out.println(String.format("%.3f",volumn/n));
		System.out.print(n*2);
	}

}
