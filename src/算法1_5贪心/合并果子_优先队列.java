package �㷨1_5̰��;

//import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

//P1090 
public class �ϲ�����_���ȶ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int ans = 0;
		Queue<Integer> a = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			a.offer(cin.nextInt());
		}
		cin.close();
		while (a.size() != 1) {
			int x = a.poll();
			int y = a.poll();
			ans += x + y;
			a.offer(x + y);
		}
		System.out.println(ans);
	}
}
