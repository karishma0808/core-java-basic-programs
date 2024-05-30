package demo;
import java.util.Scanner;
public class Months {

	public static void main(String[] args) {
		System.out.println("enter an number for getting month:");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		switch(num) {
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("february");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("august");
			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("november");
			break;
		case 12:
			System.out.println("december");
			break;
		
			default:
				System.out.println("invailid number");
		}
		s.close();
		

	}

}
