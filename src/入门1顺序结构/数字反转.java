package ����1˳��ṹ;

//P5705
//����һ����С�� 100 ��С�� 1000��ͬʱ����С�����һλ��һ�������������� 123.4 ��Ҫ���������ַ�ת��������� 4.321 �������
import java.util.Scanner;
import java.lang.StringBuffer;

public class ���ַ�ת {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String num = cin.next();
		System.out.print(new StringBuffer(num).reverse());
		cin.close();
	}
}
