package JavaPrograms;

public class ArmstrongNumber {

	
	public static void isArmstrongNum(int num) {
		
		int lastNum = 0;
		int cubes = 0;
		int temp;
		
		temp= num;
		while(num>0) {
			System.out.println("Current number is: "+num);
			lastNum = num%10;
			System.out.println("Individual num is: "+lastNum);
			
			cubes = cubes+(lastNum*lastNum*lastNum);
			System.out.println("Total of cubes of individual is: "+cubes);
			
			num = num/10;
		}
		if(temp == cubes) {
			System.out.println(cubes+" is a Armstrong number");
		}else {
			System.out.println(cubes+" is not a Armstrong number");
		}
	}
	

	public static void main(String[] args) {
		isArmstrongNum(153);
		System.out.println("***************");
		
	}
}
