package 入门2分支结构;

import java.util.Scanner;

//P1424 
public class 小鱼的航程 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int x = cin.nextInt();
		int n = cin.nextInt();
		cin.close();
		int res = 0;
		while (n > 0) {
			if (x == 6) {
				x += 1;
				n -= 1;
			} else if (x == 7) {
				n -= 1;
				x = 1;
			} else {
				res += 250;
				x += 1;
				n -= 1;
			}
		}
		System.out.println(res);
	}

}
