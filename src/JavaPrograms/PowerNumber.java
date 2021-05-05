package JavaPrograms;

public class PowerNumber {

	
	public static void main(String[] args) {
		
		int base = 5;
		int power = 2;
		int result = 1;
		while (power!=0) {
			result *= base;
			--power;
		}
		System.out.println("5 to the power of 2: "+result);	
	}
}
