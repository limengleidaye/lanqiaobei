package 算法1_5贪心;

import java.util.Scanner;

//P1106 
/*
 * 首先，考虑第一位。将第一位所有可能的位置枚举一下，取最小且最前的一个。
 * 因为同样长度的数字比较看开头，于是这样便保证了第一位的最优性。
 * 要注意，要取最前的一个，尽量保留更多的可选数。
 * 而第二位就在第一个数之后的所有允许范围内枚举，方法同第一位。
 * 这样，取完了所有要取的数，然后输出就可以了。
 */
public class 删数问题_贪心 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String n = cin.next();
		int k = cin.nextInt();
		cin.close();
		int len = n.length();
		int[] nums = new int[len];
		for (int i = 0; i < len; i++) {
			nums[i] = n.charAt(i) - '0';
		}
		int[] ans = new int[len - k];
		// 注意初始化，上一个开头要取-1，因为第一位有可能取第0个
		// index已选择的数
		int index = 0, init = -1;
		while (len - k - index > 0) {
			int MIN = 10000000;
			for (int i = init + 1; i <= k + index; i++) {
				if (nums[i] < MIN)
					MIN = nums[init = i];
			}
			ans[index++] = nums[init];
		}
		int start = 0;
		while (ans[start] == 0)
			start++;
		for (int i = start; i < len - k; i++) {
			System.out.print(ans[i]);
		}
	}

}
