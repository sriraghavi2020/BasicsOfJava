package JavaPrograms;

public class PrimeNumber {

	public static boolean primeNumber(int n) {
		if(n<=1) {
			return false;
		}
		for(int i = 2; i<n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void primeNumberRange(int n) {


		for(int i = 2; i<n; i++) {
			if(primeNumber(i)) {

				System.out.println(i);	
			}

		}
	}
	public static void primeNumberSum(int num) {
		
		for(int i = 2; i<num; i++) {
			if(primeNumber(i)) {
				if(primeNumber(num-i)) {
					System.out.println(num+ "=" +i+ "+" +(num-i));
				}
			}
		}
		
	}
		public static void main(String[] args) {
			System.out.println(primeNumber(13));
			System.out.println("**********");
			primeNumberRange(20);
			System.out.println("**********");
			primeNumberSum(34);
		}
	}
