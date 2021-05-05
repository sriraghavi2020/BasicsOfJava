package JavaPrograms;

public class LeapYear {

	
	public static boolean isLeapyear(int year) {
		
		if(year %4 ==0) {
			if(year %100 == 0) {
				if(year %400 ==0) {
					return true;
				}else return false;
			}else return false;
		}else return false;
	}
	
	public static void main(String[] args) {
		
		int year = 1990;
		System.out.println(year+ " is a leap year is "+isLeapyear(year));	
	}
}
