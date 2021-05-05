package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateStr {

	
	public static void duplicateWordwithMap(String line) {
		String duplicate[] = line.split(" ");
		HashMap<String, Integer> count = new HashMap<String, Integer>();	// 2a. creating map for getting the count
		for(String word: duplicate) {  // 1. iterating 
			Integer dupCount = count.get(word);	// 2b. gets the time of occurrence of each number 'get(each number)'
			if(dupCount==null) {
				dupCount=0;		//3. if null, assign value to 0
			}
			count.put(word, dupCount +1);		//4. register the count to the map (number, count)
		}
		
		//To display the value
		
		Set<String> dup = count.keySet();	// 1. register the map 'count' to integer Set
		for(String dup1:dup) {			//2. iteration
			if(count.get(dup1)>1) {	//3. if count of 1st value is greater than 1
				System.out.println("Duplicate word is '"+dup1+"' occurence count: " +count.get(dup1));
			}
		}
		
	}
	public static void duplicateWordwithHashSet(String line) {
		String duplicate[] = line.split(" ");
		Set<String> words = new HashSet<String>();
		for(String dup: duplicate) {
			if(words.add(dup)==false) {
				System.out.println("Duplicate words are '"+dup+"'");
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		String sentence = "Hey this is tom and this is jack and jill";
		duplicateWordwithMap(sentence);
		System.out.println("***************");
		duplicateWordwithHashSet(sentence);
	}
}
