package 算法1_1模拟与高精度;

import java.util.Scanner;

//P1518 
public class 两只塔姆沃斯牛$移动与转弯 {
	public boolean bondary() {
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] f = new char[10][10];
		Scanner cin = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			f[i] = cin.next().toCharArray();
		}
		cin.close();
		int cx = 0, cy = 0, fx = 0, fy = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (f[i][j] == 'C') {
					cx = i;
					cy = j;
				}
				if (f[i][j] == 'F') {
					fx = i;
					fy = j;
				}
			}
		}
		int flagc = 1, flagf = 1, res = 0;
		while (!(cx == fx && cy == fy)) {
			// 牛走
			if (flagc == 1) {
				if (cx - 1 < 0 || f[cx - 1][cy] == '*') {
					flagc++;
				} else {
					cx--;
				}
			} else if (flagc == 2) {
				if (cy + 1 > 9 || f[cx][cy + 1] == '*') {
					flagc++;
				} else {
					cy++;
				}
			} else if (flagc == 3) {
				if (cx + 1 > 9 || f[cx + 1][cy] == '*') {
					flagc++;
				} else {
					cx++;
				}
			} else {
				if (cy - 1 < 0 || f[cx][cy - 1] == '*') {
					flagc = 1;
				} else {
					cy--;
				}
			}
			// 人走
			if (flagf == 1) {
				if (fx - 1 < 0 || f[fx - 1][fy] == '*') {
					flagf++;
				} else {
					fx--;
				}
			} else if (flagf == 2) {
				if (fy + 1 > 9 || f[fx][fy + 1] == '*') {
					flagf++;
				} else {
					fy++;
				}
			} else if (flagf == 3) {
				if (fx + 1 > 9 || f[fx + 1][fy] == '*') {
					flagf++;
				} else {
					fx++;
				}
			} else {
				if (fy - 1 < 0 || f[fx][fy - 1] == '*') {
					flagf = 1;
				} else {
					fy--;
				}
			}
			res++;
			if (res == 200000) {
				break;
			}
		}
		if (res == 200000) {
			System.out.println(0);
		} else {
			System.out.println(res);
		}
	}

}
