package ���ݽṹ1_1���Ա�;

import java.util.Scanner;
import java.util.Stack;

//P4387 
public class ��֤ջ����_ {

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
			int index = 0;// ����
			for (int i = 0; i < n; i++) {
				stack.push(pushed[i]);
				//*****************************************
				while (stack.peek() == poped[index]) {
				//*****************************************
					stack.pop();
					index++;
					if (stack.isEmpty())// ��ջ��ʱ�����˳�ջ����
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
