package JavaPrograms;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		System.out.println("Enter a string to reverse: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String orginal = input.nextLine();
		
		for(int i = orginal.length()-1; i>=0; i--) {
			System.out.println(orginal.charAt(i));
		}
	}
}
