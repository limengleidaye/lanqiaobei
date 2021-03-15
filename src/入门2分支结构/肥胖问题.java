package 入门2分支结构;

import java.util.Scanner;

//P5714 
//保留有效数字
public class 肥胖问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		double m = cin.nextDouble();
		double h = cin.nextDouble();
		cin.close();
		double BMI = m / Math.pow(h, 2);
		if (BMI < 18.5)
			System.out.println("Underweight");
		else if (BMI >= 18.5 && BMI < 24)
			System.out.println("Normal");
		else {
			System.out.println(BMI);
			System.out.println("Overweight");
		}
	}

}
