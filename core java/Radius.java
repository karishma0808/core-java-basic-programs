package demo;
import java.util.Scanner;
public class Radius {

	public static void main(String[] args) {
		System.out.println("enter the redius of circle:");
		Scanner s=new Scanner(System.in);
		double r=s.nextDouble();
		double circumference=2*Math.PI*r;
		double area=Math.PI*r*r;
		System.out.println("redius of circumference:"+circumference);
		System.out.println("area of redius:"+area);
		s.close();

	}

}
