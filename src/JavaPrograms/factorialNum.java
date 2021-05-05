

package JavaPrograms;

import java.util.Scanner;

public class factorialNum {

	//without recursion
	//for loop
	public static void factorialNumber(int num) {
		int factorial = 1;
		if(num == 0) {
			System.out.println("Factorial is 1");
		}else {
		for(int i = 1; i<=num; i++) {
			factorial*= i;		// factorial = factorial*i
		}
		System.out.println("Factorial number of "+num+" is: "+factorial);
	}
	}
	
	//while loop
	public static void factWhilieloop(int num) {
		int factorial = 1;
		int i = 1;
		
		if(num==0) {
			System.out.println("Factorial is 1");
		}else {
		while(i<=num) {
			factorial*= i;
			i++;
		}
		System.out.println("Factorial number of "+num+" is: "+factorial);
	}
	}
	
	//with recursion
	public static int factRecursion(int num) {
	
		if(num==0) 
			return 1;
		else
			return (num*factRecursion(num-1));
		
	}
	
public static void main(String[] args) {
	
	
	System.out.print("Enter a number for its factorial number:");
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	factorialNumber(num);
//	factWhilieloop(5);
//	factorialNumber(0);
//	System.out.println("Factorial of 4: "+factRecursion(4));
}
}

