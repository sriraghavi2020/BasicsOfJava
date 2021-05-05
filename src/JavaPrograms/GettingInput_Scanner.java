package JavaPrograms;

import java.util.Scanner;

public class GettingInput_Scanner {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Integer input
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		System.out.println("Entered number: "+i);
		
		//String input
		System.out.print("Enter a string: ");
		Scanner str = new Scanner(System.in);
		String s= str.nextLine();
		System.out.println("Entered string: "+s);
	}

}
