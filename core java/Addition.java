package demo;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter 1st number");
		int a=scanner.nextInt();
		System.out.println("enter 2nd number");
		int b=scanner.nextInt();
		
		int c=a+b;
		System.out.println("the sum of the" +a+ "and" +b+"is :" +c);
		scanner.close();

	}

}
