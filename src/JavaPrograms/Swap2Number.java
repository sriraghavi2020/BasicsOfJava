package JavaPrograms;

public class Swap2Number {
	public static void swapWiththirdVar(int a, int b) {
		int temp;
		System.out.println("Before swapping: a="+a+" and b:"+b);
		temp= a;
		a=b;
		b= temp;
		System.out.println("After swapping: a="+a+" and b:"+b);
		
	}
	public static void swapWithoutVar(int a, int b) {
		System.out.println("Before swapping: a="+a+" and b:"+b);
//		a=a+b;
//		b=a-b;
//		a=a-b;
		a=a-b;
		b=a+b;
		a=a-b;		//both are correct
		System.out.println("Before swapping: a="+a+" and b:"+b);
		
		
	}
	
	public static void main(String[] args) {
		swapWiththirdVar(2, 3);
		swapWithoutVar(11,237);
	}

}
