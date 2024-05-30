package demo;
import java.util.Scanner;
public class GreatestOfTow {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number:");
		double num1=s.nextDouble();
		System.out.println("enter the first number:");
		double num2=s.nextDouble();
		double max=Math.max(num1, num2);
		System.out.println("Greatest of tow number is:"+max);
		s.close();

	}

}
