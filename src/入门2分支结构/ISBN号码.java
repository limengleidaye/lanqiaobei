package 入门2分支结构;

import java.util.Scanner;

//P1055 
public class ISBN号码 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String ISBN = cin.next();
		cin.close();
		String ISBNNum_str = ISBN.replace("-", "");
		char[] ISBNNum = ISBNNum_str.toCharArray();
		int res = 0;
		for (int i = 0; i < 9; i++) {
			res += (i + 1) * (ISBNNum[i] - '0');
		}
		res %= 11;
		if (res == (ISBNNum[9] - '0')) {
			System.out.println("Right");
		} else {
			if (res == 10)
				System.out.println(ISBN.substring(0, 12) + 'X');
			else
				System.out.println(ISBN.substring(0, 12) + res);
		}
	}

}
