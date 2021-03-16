package 算法1_1模拟与高精度;

import java.util.Scanner;

//P1098 
public class 字符串展开 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int p1 = cin.nextInt();
		int p2 = cin.nextInt();
		int p3 = cin.nextInt();
		char[] str = cin.next().toCharArray();
		cin.close();
		for (int i = 0; i < str.length; i++) {
			if (str[i] == '-') {
				if (str[i + 1] - str[i - 1] == 1) {
					continue;
				} else if (str[i + 1] - str[i - 1] <= 0) {
					System.out.print('-');
				} else {
					if (p1 == 1) {
						if (p3 == 1) {
							for (int j = 1; j < str[i + 1] - str[i - 1]; j++) {
								for (int k = 0; k < p2; k++)
									System.out.print((char) (str[i - 1] + j));
							}
						} else {
							for (int j = 1; j < str[i + 1] - str[i - 1]; j++) {
								for (int k = 0; k < p2; k++)
									System.out.print((char) (str[i + 1] - j));
							}
						}
					} else if (p1 == 2) {
						if (p3 == 1) {
							for (int j = 1; j < str[i + 1] - str[i - 1]; j++) {
								for (int k = 0; k < p2; k++)
									System.out.print((char) (str[i - 1]  + j-32));
							}
						} else {
							for (int j = 1; j < str[i + 1] - str[i - 1]; j++) {
								for (int k = 0; k < p2; k++)
									System.out.print((char) (str[i + 1] - j-32));
							}
						}
					} else {
						if (p3 == 1) {
							for (int j = 1; j < str[i + 1] - str[i - 1]; j++) {
								for (int k = 0; k < p2; k++)
									System.out.print('*');
							}
						}
					}
				}

			} else {
				System.out.print(str[i]);
			}
		}
	}

}
