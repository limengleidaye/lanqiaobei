package ����2��֧�ṹ;

import java.util.Scanner;

//P5714 
//������Ч����
public class �������� {

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
