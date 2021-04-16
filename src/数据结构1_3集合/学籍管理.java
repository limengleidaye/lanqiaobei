package 数据结构1_3集合;

import java.util.HashMap;
import java.util.Scanner;

//P5266 
public class 学籍管理 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		HashMap<String, Integer> stus = new HashMap<>();
		while (n-- > 0) {
			int opt = cin.nextInt();
			String name;
			switch (opt) {
			case 1:
				name = cin.next();
				int score = cin.nextInt();
				stus.put(name, score);
				System.out.println("OK");
				break;
			case 2:
				name = cin.next();
				if (stus.containsKey(name)) {
					System.out.println(stus.get(name));
				} else {
					System.out.println("Not found");
				}
				break;
			case 3:
				name = cin.next();
				if (stus.containsKey(name)) {
					stus.remove(name);
					System.out.println("Deleted successfully");
				} else {
					System.out.println("Not found");
				}
				break;
			case 4:
				System.out.println(stus.size());
				break;
			}
		}
		cin.close();
	}

}
