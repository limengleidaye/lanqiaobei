package ����2��֧�ṹ;


import java.util.Scanner;

//P5716 
//������ݺ��·ݣ������һ�����һ���ж����졣��Ҫ�������ꡣ
public class �·����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] month_day = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner cin = new Scanner(System.in);
		int year = cin.nextInt();
		int month = cin.nextInt();
		boolean isLeap = false;
		cin.close();
		if (year % 4 == 0 && year % 100 != 0)
			isLeap=true;
		else if (year % 100 == 0 && year % 400 == 0)
			isLeap=true;
		if(isLeap==false) {
			System.out.println(month_day[month-1]);
		}else {
			if(month==2)
				System.out.println(month_day[month-1]+1);
			else
				System.out.println(month_day[month-1]);
		}
	}

}
