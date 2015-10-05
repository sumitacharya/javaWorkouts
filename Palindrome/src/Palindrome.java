public class Palindrome {
	/*
	 * word to check for palindrome
	 */
	private String word;
	
	/*
	 * Constructor
	 * @param text Input string
	 */
	public Palindrome(String text){
		word = text;
	}
	
	/*
	 * returns word for Palindrome to check
	 */
	public String getPalindrome(){
		return word;
	}
	
	/*
	 * Returns the reversed string
	 * @param w Input String
	 */
	public static String reverse(String w){
		String rev = ""; 
		for(int i=w.length()-1;i>=0;i--){
			rev = rev + w.charAt(i);
		}
		return rev;
	}
	
	/*
	 * Main part goes here.
	 * Constructor defines the input String to check
	 * After comparing normal string and reversed string palindromity is identified.
	 * Displays if Palindrome or not
	 */
	public static void main(String[] args) {
		Palindrome p1 = new Palindrome("12321");
		String p = p1.getPalindrome();
		System.out.println(p);
		if (p.equals(reverse(p))){
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
