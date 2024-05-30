package demo;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
		s.close();
	}

}
