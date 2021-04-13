package ¼¯ºÏ;

import java.util.Scanner;
import java.util.TreeSet;

//P5250 
public class Ä¾²Ä²Ö¿â$TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		TreeSet<Integer> wood = new TreeSet<>();
		while (n-- > 0) {
			int opt = cin.nextInt();
			int len = cin.nextInt();
			if (opt == 1) {
				if (wood.contains(len)) {
					System.out.println("Already Exist");
				} else
					wood.add(len);
			} else {
				if (wood.isEmpty())
					System.out.println("Empty");
				else {
					if (wood.contains(len)) {
						System.out.println(len);
						wood.remove(len);
					} else {
						Object ans = 0;
						Object lower = wood.lower(len);
						Object higher = wood.higher(len);
						if (lower == null) {
							ans = higher;
						} else if (higher == null) {
							ans = lower;
						} else {
							if (len - (int) lower <= (int) higher - len) {
								ans = lower;
							} else {
								ans = higher;
							}
						}
						System.out.println(ans);
						wood.remove(ans);
					}
				}
			}
		}
		cin.close();
	}

}
