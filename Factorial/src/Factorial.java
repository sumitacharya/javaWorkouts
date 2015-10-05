import java.util.Scanner;

public class Factorial {
	/** Calculates factorial of user input number using recursion.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = input.nextInt();
		System.out.println("The factorial of " + num +" is : " + factorial(num));
	}
	/*
	 * Calculates the factorial using recursive approach.
	 */
	public static int factorial(int n){
		if (n == 0) return 1; 
		else return n * factorial(n-1);
	}
}
