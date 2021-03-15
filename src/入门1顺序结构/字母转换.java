package 入门1顺序结构;

import java.util.Scanner;

//P5704
//输入一个小写字母，输出其对应的大写字母。例如输入 q[回车] 时，会输出 Q。
public class 字母转换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String letter = cin.next();
		System.out.print(letter.toUpperCase());
	}

}
