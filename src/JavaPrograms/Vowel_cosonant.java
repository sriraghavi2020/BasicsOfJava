package JavaPrograms;

import java.util.Scanner;

public class Vowel_cosonant {
 public static void main(String[] args) {
	 
	 System.out.println("Enter a letter to check for vowel or cosonant:");
	 @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	 String a =in.nextLine();
	 
	 switch(a) {

	 case "a":
	 case "e":
	 case "i":
	 case "o":
	 case "u":
	 System.out.println("Is a vowel");
	 break;
	 default:
		 System.out.println("cosonant");
		 break;
	 }
 }
}
