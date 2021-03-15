package 入门2分支结构;

import java.util.Scanner;

//P5710 
public class 数的性质 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		cin.close();
		if(num%2==0&&(num<=12&&num>4)) {
			System.out.print(1+" ");
		}else
			System.out.print(0+" ");
		if(num%2==0||(num<=12&&num>4)) {
			System.out.print(1+" ");
		}else
			System.out.print(0+" ");
		if((num%2==0&&!(num<=12&&num>4))||(num%2!=0&&(num<=12&&num>4))) {
			System.out.print(1+" ");
		}else
			System.out.print(0+" ");
		if(num%2!=0&&!(num<=12&&num>4)) {
			System.out.print(1);
		}else
			System.out.print(0);
	}

}
