package demo;
import java.util.Scanner;

public class EligibleAge {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the voter's age:");
		int age=s.nextInt();
		if(age>=18) {
			System.out.println("voter is eligible for voting");
		}else {
			System.out.println("voter is not eligible for voting");
		}
		s.close();

	}

}
