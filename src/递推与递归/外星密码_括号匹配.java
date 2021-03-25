package 递推与递归;

import java.util.Scanner;
import java.util.Stack;

//P1928 
public class 外星密码_括号匹配 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		char[] str = cin.next().toCharArray();
		cin.close();
		StringBuffer ans = new StringBuffer();
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < str.length; i++) {
			if (stack.isEmpty()) {
				//如果栈空
				if (str[i] == '[') {
					stack.push("[");
				} else {
					ans.append(str[i]);
				}
			} else {
				//如果栈不空，栈顶为[
				if (str[i] == '[') {
					stack.push("[");
				} else if (str[i] >= '0' && str[i] <= '9') {
					// 一位数
					if (stack.peek() == "[")
						stack.push(str[i] + "");
					else {
						String temp = stack.pop();
						stack.push(temp + str[i]);
					}
				} else if (str[i] >= 'A' && str[i] <= 'Z') {
					// 如果前面是数字就直接入栈
					char temp = stack.peek().charAt(0);
					if (temp >= '0' && temp <= '9')
						stack.push(str[i] + "");
					else {
						String s = stack.pop();
						stack.push(s + str[i]);
					}
				} else {
					//为]
					String s = stack.pop();
					String temp = "";
					int num = Integer.parseInt(stack.pop());
					for (int j = 0; j < num; j++) {
						temp += s;
					}
					// [出栈
					stack.pop();
					if (stack.isEmpty()) {
						// 如果栈空，则直接加入ans
						ans.append(temp);
					} else {
						// 如果前面是数字，则入栈
						char c = stack.peek().charAt(0);
						if (c >= '0' && c <= '9') {
							stack.push(temp);
						} else {
							//如果前面是字母
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
