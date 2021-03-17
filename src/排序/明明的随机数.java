package 排序;


import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//P1059 
public class 明明的随机数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		Set<Integer> set=new TreeSet();
		int n = cin.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=cin.nextInt();
			set.add(a[i]);
		}
		cin.close();
		System.out.println(set.size());
		for(int i:set)
			System.out.print(i+" ");
	}

}
