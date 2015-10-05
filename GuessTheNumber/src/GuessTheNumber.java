import java.util.Scanner;
import java.util.Random;

/*
 * To guess the random number generated within the given range
 */
public class GuessTheNumber {
	
	/*
	 * List available ranges
	 */
	public static void selectTheRange(){
		System.out.println("Enter 100 -> Range 1 to 100");
		System.out.println("Enter 1000 -> Range 1 to 1000");
	}
	
	/*
	 * Return 7 for range [1,100]
	 * Return 12 for range [1,1000]
	 * @param max maximum value of the range
	 */
	public static int guessesLeft(int max){
		if (max==100)return 7; else return 12;
	}
	
	/*
	 * Main part of the code
	 * range goes from min to max
	 * min is always 1
	 * max can be 100 or 1000
	 * secretNm is Secret Number that is to be guessed
	 * guess is guessed Number
	 * turns define number of turns left
	 * flag changes if the number is correctly guessed within turns run out
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int range = 0; 
		int min = 1;
		int max;
		int secretNm;
		int guess;
		int turns;
		boolean flag=false;
		
		while (!(range==100||range==1000)){
			selectTheRange();
			range = input.nextInt();
		}
		max = range;
		
		turns=guessesLeft(max);
		
		secretNm = rand.nextInt(max-min)+min+1;
		
		while (turns > 0){
			System.out.print("Guessed Number = ");
			guess=input.nextInt();
			
			if (guess>secretNm){
				System.out.println("Try LOWER value");
			}
			else if (guess < secretNm){
				System.out.println("Try HIGHER value");
			}
			else if (guess == secretNm){
				flag = true;
				break;
			}
			turns = turns - 1;
			System.out.println("Guesses left : " +turns);
		}
		if (flag==true){
			System.out.println("Congratulations !!! You Guessed Correctly! ");
		}
		else {
				System.out.println("You ran out of guesses. TRY AGAIN !!! ");
		}
		
	}
}

