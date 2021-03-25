package Ëã·¨1_4µÝÍÆÓëµÝ¹é;

import java.util.Scanner;

//P1990 
public class ¸²¸ÇÇ½±Ú_µÝÍÆ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mod = 10000;
		int N = new Scanner(System.in).nextInt();
		int[] f = new int[N+1];
		int[] g = new int[N+1];
		g[0]=0;
		f[0]=f[1]=g[1]=1;
		//F[N]=F[N-1]+F[N-2]+2*G[N-2]
		//G[N]=F[N-1]+G[N-1]
		for(int i=2;i<=N;i++) {
			f[i] = (f[i-1]+f[i-2]+2*g[i-2])%mod;
			g[i] = (f[i-1]+g[i-1])%mod;
		}
		System.out.println(f[N]);
	}

}
