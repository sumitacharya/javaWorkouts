import java.util.Scanner;
import java.util.Random;

public class Hangman {
	
	/**
	 * Ask the user for name, then greets and welcomes the user
	 */
	public static void welcome() {
		Scanner input = new Scanner(System.in);
		System.out.println("Game : \"Hangman\"");
		System.out.print("Enter your name : ");
		String name = input.next();
		System.out.println("Hello " + name + " ! Welcome to the game. Play safe");
	}
	
	/**
	 * Based on how correctly the secret word is guessed, WIN or LOSE is announced.
	 * If lost, provides the correct answer.
	 * @param bool - defines if the word is correctly guessed or not
	 * @param secretWord - the correct answer
	 */
	public static void gameResult(boolean bool, String secretWord){
		
		if (bool == true) {
			System.out.println("Congratulations. You WON !!!");
		}
		else {
			System.out.println("You LOSE !!! Best of luck next time.");
			System.out.println("The secret word is : "+ secretWord);
		}
	}
	
	/**
	 * Returns the random secret word from among the list of words.
	 */
	public static String randomSecret(){
		Random rand = new Random();
		String [] wordList = {"secret","sports","private","humanity","caterpillar","matchstick","diversity","doctor","travel","survive","hungry","beautiful","hangman","company","light","concert","codeword","kitched"};
		int size = wordList.length;
		return wordList[rand.nextInt(size)];
		
	}
	
	/**
	 * Ask user to guess a character for the secret word.
	 * Returns the user input character.
	 */
	private static char userGuess(){
		char guess;
		Scanner reader = new Scanner(System.in);
		System.out.print("Guess a character : ");
		guess = reader.next().charAt(0);
		return guess;
	}
	
	/*
	 * Main code goes here
	 */
	public static void main(String[] args) {
		welcome();
		String word = randomSecret();
		
		int turns = 12;
		char dash = '-';
		char guessChar = ' ';
		String correctGuessWord = "";
		String guesses = "";
		boolean correctlyGuessed = false;
		for(int i=0; i<word.length(); i++){
			correctGuessWord=correctGuessWord+dash;
		}
		System.out.println("Word length is : "+word.length());
		System.out.println(correctGuessWord);
		while(turns>0){			
			guessChar = userGuess();
			guesses = guesses + guessChar;
			for(int j=0; j<word.length(); j++){
				if (guessChar == word.charAt(j)){
					correctGuessWord=correctGuessWord.substring(0,j)+guessChar+correctGuessWord.substring(j+1);
				}
			}
			System.out.println("\n"+correctGuessWord);
			//System.out.println("correct guessWord length is : "+correctGuessWord.length());
			if (word.equals(correctGuessWord)) {
				correctlyGuessed = true;
				break;
			}
			turns = turns - 1;
			System.out.println(turns+ " turns left.");
			System.out.print("\nAlready used guesses :");
			for(int k=0;k<guesses.length();k++){
				System.out.print(" "+guesses.charAt(k));
			}
			System.out.println();
		}
		gameResult(correctlyGuessed,word);
	}

}
