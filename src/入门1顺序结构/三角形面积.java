package 入门1顺序结构;
//P5708 
import java.util.*;
public class 三角形面积 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		float a=cin.nextFloat();
		float b=cin.nextFloat();
		float c=cin.nextFloat();
		float p=(a+b+c)/2;
		double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.print(String.format("%.1f", area));
		cin.close();
	}

}
