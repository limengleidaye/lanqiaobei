package ����1˳��ṹ;

import java.util.Scanner;

//P5706
//������ t ������լ����ˮ��Ҫ���ָ� n ��ͬѧ��ÿ��ͬѧ��Ҫ 2 �����ӡ�������֪��ÿ��ͬѧ���Ի�ö��ٺ������ϣ��ϸ�ȷ��С����� 3 λ�����Լ�һ����Ҫ���ٸ����ӡ�����һ��ʵ�� t ��һ������ n��ʹ�ÿո����������������ֱ�ʾ�𰸣�ʹ�û��и�����
public class �ٷַ�լˮ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		float volumn = cin.nextFloat();
		int n = cin.nextInt();
		System.out.println(String.format("%.3f",volumn/n));
		System.out.print(n*2);
	}

}
