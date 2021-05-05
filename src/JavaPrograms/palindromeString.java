package JavaPrograms;

import java.util.Scanner;

public class palindromeString {
	
	public static void isPalindromeStr(String palin) {
		String rev = "";
		for(int i = palin.length()-1; i>=0; i--) {
			rev = rev+palin.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(palin)) {
			System.out.println(palin+ " is a Palindrome string");
		}else {
			System.out.println(palin+ " is not a palindrome string");
		}
			
	}
	public static void main(String[] args) {
		System.out.print("Enter a string to chech for palindrome: ");
		@SuppressWarnings("resource")
		Scanner str = new Scanner(System.in);
		String palin = str.nextLine();
		isPalindromeStr(palin);
	}

}
