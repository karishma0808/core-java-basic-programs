package demo;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number:");
		int n=s.nextInt();
		 if (isPrime(n)) {
	            System.out.println(n + " is a prime number.");
	        } else {
	            System.out.println(n + " is not a prime number.");
	        }
		 s.close();
	    }
	
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

	}

}
