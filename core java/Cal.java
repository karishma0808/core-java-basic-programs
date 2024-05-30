package demo;
import java.util.Scanner;
public class Cal {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter 1st number:");
		int a=s.nextInt();
		System.out.println("enter the oprator:");
		char oprator=s.next().charAt(0);
		System.out.println("enter 2nd number:");
		int b=s.nextInt();
		int result=0;
		switch(oprator) {
		case'+':
			result=a+b;
			break;
		case'-':
			result=a-b;
			break;
		case'*':
			result=a*b;
			break;
		case'/':
			if(b!=0) 
				result=a/b;
		else 
			System.out.println("not divisible by zero");
			default:
				System.out.println("invailid oprator");
		}
				System.out.println("Result: " + result);

		        s.close();
	}

}
