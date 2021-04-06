package 数据结构1_1线性表;

import java.util.Scanner;
import java.util.Stack;

//P4387 
public class 验证栈序列_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int q = cin.nextInt();
		while (q-- > 0) {
			int n = cin.nextInt();
			int[] pushed = new int[n];
			for (int i = 0; i < n; i++) {
				pushed[i] = cin.nextInt();
			}
			int[] poped = new int[n];
			for (int i = 0; i < n; i++) {
				poped[i] = cin.nextInt();
			}
			Stack<Integer> stack = new Stack<>();
			int index = 0;// 计数
			for (int i = 0; i < n; i++) {
				stack.push(pushed[i]);
				//*****************************************
				while (stack.peek() == poped[index]) {
				//*****************************************
					stack.pop();
					index++;
					if (stack.isEmpty())// 当栈空时还用了出栈操作
						break;
				}
			}
			if (stack.isEmpty())
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		cin.close();
	}

}
