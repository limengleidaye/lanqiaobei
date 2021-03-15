package 入门1顺序结构;

//P5705
//输入一个不小于 100 且小于 1000，同时包括小数点后一位的一个浮点数，例如 123.4 ，要求把这个数字翻转过来，变成 4.321 并输出。
import java.util.Scanner;
import java.lang.StringBuffer;

public class 数字反转 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String num = cin.next();
		System.out.print(new StringBuffer(num).reverse());
		cin.close();
	}
}
