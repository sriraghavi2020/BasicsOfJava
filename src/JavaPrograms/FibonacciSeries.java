package JavaPrograms;

public class FibonacciSeries {
	
	
	
	
	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13 21
		int sum = 0;
		int i1= 0;
		int i2 = 1;
		
		for(int i = 0; i<=10; i++) {
			sum = i1 + i2;
			i1= i2;
			i2 =sum;
			System.out.print(sum+"  ");
		}
			
		
		
	}
}
