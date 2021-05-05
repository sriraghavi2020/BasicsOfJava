package JavaPrograms;

public class palindromeNumber {
	
	public static void isPanlindromeNum(int num) {
		int lastNum = 0;
		int NumToRev = 0;
		int temp;
		
		temp = num; 
		
		while(num>0) {		//procedure for reverse number
			System.out.println("Current number is: " +num);
			lastNum = num%10;
			System.out.println("Current digit: "+lastNum);
			NumToRev= (NumToRev*10)+lastNum;
			System.out.println("Number Stored in temp: "+NumToRev);
			num = num/10;
		}
		if (temp ==NumToRev) {
			System.out.println(temp+ " Number is a Palindrome");
		}else {
			System.out.println(temp+ " Number is not Palindrome");
		}
	}
	
	
	public static void palindromeWithReverse(int num) {
		String revNum= "";
		String rev = Integer.toString(num);
		for(int i = rev.length()-1; i>=0; i--) {
			revNum = revNum+rev.charAt(i);
		}
		System.out.println(revNum);
		int revNumInt = Integer.parseInt(revNum);
		if(revNumInt == num) {
			System.out.println(num+ " Number is a Palindrome");
		}else {
			System.out.println(num+ " Number is not Palindrome");
		}
		
		
	}
	public static void main(String[] args) {
		
		isPanlindromeNum(123);
		//palindromeWithReverse(15151);
	}

}
