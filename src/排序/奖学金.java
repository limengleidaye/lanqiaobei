package ≈≈–Ú;

import java.util.Arrays;
import java.util.Scanner;

//P1093 
class Stu implements Comparable<Stu> {
	int total, chin, math, eng, id;

	public Stu(int idx, int c, int m, int e) {
		id = idx;
		chin = c;
		math = m;
		eng = e;
		total = chin + math + eng;
	}

	public int getTotal() {
		return total;
	}

	public int getChin() {
		return chin;
	}

	public int getId() {
		return id;
	}

	public int getMath() {
		return math;
	}

	public int getEng() {
		return eng;
	}

	@Override
	public int compareTo(Stu o) {
		// TODO Auto-generated method stub
		if (this.getTotal() > o.getTotal())
			return -1;
		else if (this.getTotal() == o.getTotal()) {
			if (this.getChin() > o.getChin())
				return -1;
			else if (this.getChin() == o.getChin())
				if (this.getId() < o.getId())
					return -1;
		}
		return 1;
	}
}

public class Ω±—ßΩ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		Stu[] stus = new Stu[n];
		for (int i = 0; i < n; i++) {
			int c = cin.nextInt();
			int m = cin.nextInt();
			int e = cin.nextInt();
			stus[i] = new Stu(i + 1, c, m, e);
		}
		cin.close();
		Arrays.sort(stus);
		for (int i = 0; i < 5; i++) {
			System.out.println(stus[i].getId() + " " + stus[i].getTotal());
		}
	}

}
