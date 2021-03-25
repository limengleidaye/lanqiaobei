package Ëã·¨1_3±©Á¦Ã¶¾Ù;

import java.util.Scanner;

public class ¿¾¼¦ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		cin.close();
		int res = 0;
		for (int a = 1; a <= 3; a++)
			for (int b = 1; b <= 3; b++)
				for (int c = 1; c <= 3; c++)
					for (int d = 1; d <= 3; d++)
						for (int e = 1; e <= 3; e++)
							for (int f = 1; f <= 3; f++)
								for (int g = 1; g <= 3; g++)
									for (int h = 1; h <= 3; h++)
										for (int i = 1; i <= 3; i++)
											for (int j = 1; j <= 3; j++)
												if (a + b + c + d + e + f + g + h + i + j == n)
													res++;
		if (res == 0)
			System.out.println(0);
		else {
			System.out.println(res);
			for (int a = 1; a <= 3; a++)
				for (int b = 1; b <= 3; b++)
					for (int c = 1; c <= 3; c++)
						for (int d = 1; d <= 3; d++)
							for (int e = 1; e <= 3; e++)
								for (int f = 1; f <= 3; f++)
									for (int g = 1; g <= 3; g++)
										for (int h = 1; h <= 3; h++)
											for (int i = 1; i <= 3; i++)
												for (int j = 1; j <= 3; j++)
													if (a + b + c + d + e + f + g + h + i + j == n)
														System.out.println(a + " " + b + " " + c + " " + d + " " + e
																+ " " + f + " " + g + " " + h + " " + i + " " + j);
		}

	}
}
