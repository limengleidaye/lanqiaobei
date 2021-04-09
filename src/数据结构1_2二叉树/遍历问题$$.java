package 数据结构1_2二叉树;

import java.util.Scanner;

//P1229 
public class 遍历问题$$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String pre = cin.next();
		String pos = cin.next();

		cin.close();
		int ans = 1;
		for (int i = 0; i < pre.length() - 1; i++) {
			for (int j = 1; j < pos.length(); j++) {
				if (pre.charAt(i) == pos.charAt(j) && pre.charAt(i + 1) == pos.charAt(j - 1))
					ans *= 2;
			}
		}
		System.out.println(ans);
	}

}
