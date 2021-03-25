package 算法1_5贪心;

import java.util.Arrays;
import java.util.Scanner;

//P2240 
//反证法证明贪心
class Treasure implements Comparable<Treasure> {
	double m, v = 0;

	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}

	public double getV() {
		return v;
	}

	public void setV(double v) {
		this.v = v;
	}

	@Override
	public int compareTo(Treasure o) {
		// TODO Auto-generated method stub
		return this.getV() / this.getM() > o.getV() / o.getM() ? -1 : 1;
	}

}

public class 部分背包问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int T = cin.nextInt();
		Treasure[] mv = new Treasure[N];
		for (int i = 0; i < N; i++) {
			mv[i] = new Treasure();
			mv[i].setM(cin.nextDouble());
			mv[i].setV(cin.nextDouble());
		}
		cin.close();
		Arrays.sort(mv);
		double ans = 0;
		int i;
		for (i = 0; T - mv[i].getM() > 0; i++) {
			T -= mv[i].getM();
			ans += mv[i].getV();
		}
		if (T > 0) {
			ans += T * mv[i].getV() / mv[i].getM();
		}
		System.out.printf("%.2f",ans);
	}
}
