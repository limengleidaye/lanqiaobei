package �㷨1_5̰��;

import java.util.Scanner;

//P1106 
/*
 * ���ȣ����ǵ�һλ������һλ���п��ܵ�λ��ö��һ�£�ȡ��С����ǰ��һ����
 * ��Ϊͬ�����ȵ����ֱȽϿ���ͷ�����������㱣֤�˵�һλ�������ԡ�
 * Ҫע�⣬Ҫȡ��ǰ��һ����������������Ŀ�ѡ����
 * ���ڶ�λ���ڵ�һ����֮�����������Χ��ö�٣�����ͬ��һλ��
 * ������ȡ��������Ҫȡ������Ȼ������Ϳ����ˡ�
 */
public class ɾ������_̰�� {

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
		// ע���ʼ������һ����ͷҪȡ-1����Ϊ��һλ�п���ȡ��0��
		// index��ѡ�����
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
