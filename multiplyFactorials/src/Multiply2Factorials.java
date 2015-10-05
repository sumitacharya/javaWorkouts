import java.util.Scanner;

public class Multiply2Factorials extends Factorial {

	/** 
	 * Uses Factorial project to find the factors of given numbers
	 * Calculates product of two factorials.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		System.out.print("1st number : ");
		int num1 = input.nextInt();
		System.out.print(" \n2nd number : ");
		int num2 = input.nextInt();
		System.out.println("Factorial of 1st number = " + factorial(num1));
		System.out.println("Factorial of 2nd number = " + factorial(num2));
		System.out.println("product = " + factorial(num1) * factorial(num2));
	}

}
