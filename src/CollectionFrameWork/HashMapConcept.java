package CollectionFrameWork;

import java.util.HashMap;

public class HashMapConcept {

	
	public static void simpleHashMapConcept() {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "Tom");
		hashmap.put(2, "Harry");
		hashmap.put(3, "John");
		System.out.println("*********");
		System.out.println(hashmap.get(1));
		System.out.println("*********");
		//To print
		//To get all Data
		for(HashMap.Entry<Integer, String> obj : hashmap.entrySet()) {
			System.out.println(obj.getKey()+", " +obj.getValue());
		}
	
	}
	
	public static void HashMapWithData() {
		
		Emp_Data emp1 = new Emp_Data("Jack", 10, "Mech");
		Emp_Data emp2 = new Emp_Data("Jill", 10, "Elec");
		Emp_Data emp3 = new Emp_Data("Juck", 10, "Mech");
		
		HashMap<Integer, Emp_Data> map = new HashMap<Integer, Emp_Data>();
		map.put(1, emp1);
		map.put(2, emp2);
		map.put(3, emp3);
		System.out.println("*********");
		Emp_Data data = map.get(3);
		System.out.println(data.name+", "+data.age+", "+data.dept);
		System.out.println("*********");
		for(HashMap.Entry<Integer, Emp_Data> obj1 : map.entrySet()) {
			
			int key = obj1.getKey();
			Emp_Data empData = obj1.getValue();
			
			System.out.print(key+ " ---->");
			System.out.println(empData.name+", "+empData.age+", "+empData.dept);
		}
		
		
	}
	
	public static void main(String[] args) {
		simpleHashMapConcept();
		HashMapWithData();
	}
}
