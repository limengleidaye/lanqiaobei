package ������ݹ�;

import java.util.Scanner;
import java.util.Stack;

//P1928 
public class ��������_����ƥ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		char[] str = cin.next().toCharArray();
		cin.close();
		StringBuffer ans = new StringBuffer();
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < str.length; i++) {
			if (stack.isEmpty()) {
				//���ջ��
				if (str[i] == '[') {
					stack.push("[");
				} else {
					ans.append(str[i]);
				}
			} else {
				//���ջ���գ�ջ��Ϊ[
				if (str[i] == '[') {
					stack.push("[");
				} else if (str[i] >= '0' && str[i] <= '9') {
					// һλ��
					if (stack.peek() == "[")
						stack.push(str[i] + "");
					else {
						String temp = stack.pop();
						stack.push(temp + str[i]);
					}
				} else if (str[i] >= 'A' && str[i] <= 'Z') {
					// ���ǰ�������־�ֱ����ջ
					char temp = stack.peek().charAt(0);
					if (temp >= '0' && temp <= '9')
						stack.push(str[i] + "");
					else {
						String s = stack.pop();
						stack.push(s + str[i]);
					}
				} else {
					//Ϊ]
					String s = stack.pop();
					String temp = "";
					int num = Integer.parseInt(stack.pop());
					for (int j = 0; j < num; j++) {
						temp += s;
					}
					// [��ջ
					stack.pop();
					if (stack.isEmpty()) {
						// ���ջ�գ���ֱ�Ӽ���ans
						ans.append(temp);
					} else {
						// ���ǰ�������֣�����ջ
						char c = stack.peek().charAt(0);
						if (c >= '0' && c <= '9') {
							stack.push(temp);
						} else {
							//���ǰ������ĸ
							String s1 = stack.pop();
							stack.push(s1 + temp);
						}
					}
				}
			}
			
		}
		System.out.println(ans);
	}
}
