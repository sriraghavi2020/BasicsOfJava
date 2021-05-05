package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class DuplicateNum {

	
	public static void duplicateNumCount(int num[]) {
		int duplicateArray[] = num;
		for(int i = 0; i<num.length; ++i) {
			int count= 0;
			for(int j = i+1; j<num.length; ++j) {
				
				if(num[i]==duplicateArray[j]) {
					count++;
					
					} 
				}
			if(count>0) {
				System.out.println("Duplicate number is "+num[i]);
			}
		}
	}
	public static void duplicateNumwithMap(int num[]) {
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();	// 2a. creating map for getting the count
		for(int number: num) {  // 1. iterating 
			Integer dupCount = count.get(number);	// 2b. gets the time of occurrence of each number 'get(each number)'
			if(dupCount==null) {
				dupCount=0;		//3. if null, assign value to 0
			}
			count.put(number, dupCount +1);		//4. register the count to the map (number, count)
		}
		
		//To display the value
		
		Set<Integer> dup = count.keySet();	// 1. register the map 'count' to integer Set
		for(int dup1:dup) {			//2. iteration
			if(count.get(dup1)>1) {	//3. if count of 1st value is greater than 1
				System.out.println("Duplicate number: "+dup1+" occurence count: " +count.get(dup1));
			}
		}
		
	}
	public static void duplicateNumwithHashSet(int num[]) {
		
		Set<Integer> words = new HashSet<Integer>();
		for(int dup: num) {
			if(words.add(dup)==false) {
				System.out.println("Duplicate numbers are '"+dup+"'");
			}
		}
		
		
	}
	public static void main(String[] args) {
		int numArray[] = {1,2,3,1,1,4,5,6,3,4,7,8,9,5,8};	//when repeated for one time but cannot get the count for than one time  
		duplicateNumCount(numArray);
		System.out.println("****************");
		duplicateNumwithMap(numArray);
		System.out.println("****************");
		duplicateNumwithHashSet(numArray);
	}
}
