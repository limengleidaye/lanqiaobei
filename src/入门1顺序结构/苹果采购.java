package 入门1顺序结构;

import java.math.BigInteger;
import java.util.Scanner;

//P5703
//现在需要采购一些苹果，每名同学都可以分到固定数量的苹果，并且已经知道了同学的数量，请问需要采购多少个苹果？

public class 苹果采购 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		BigInteger a = cin.nextBigInteger();
		BigInteger b = cin.nextBigInteger();
		System.out.print(a.multiply(b));
	}

}
