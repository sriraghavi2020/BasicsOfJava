package CoreJava;

public class DataTypePrintConcatenation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int i = 0;
	//	int i = 1; duplicate variable creation
	//	i= 1;
		double d = 10.1;
		double d1 = 10; // will also accept integer
		
		char c= 'a';
		String s = "kiriti";
		System.out.println(s.length());
		System.out.println(s.charAt(0));
//		for(int i = 0; i<s.length(); i++) {
//			//System.out.println(s.charAt(i));
//			
//			System.out.println(s.charAt(i));
//		}
//		
		System.out.println(s.charAt(5));
		System.out.println("************");
		for(int j = s.length()-1; j>=0; j--) {
			//System.out.println(s.charAt(i));
			
			System.out.println(s.charAt(j));
		}
	}

}
