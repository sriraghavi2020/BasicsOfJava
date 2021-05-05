package CoreJava;

public class Class_Obj_Constructor {
	
	//int i;
	//String name;
	
	int id;
	String Name;

	Class_Obj_Constructor(){
		System.out.println("Default constructor");
	}
	
	Class_Obj_Constructor(int idNum, String studentName){
		
		id= idNum; 
		Name= studentName;
		
		//this.Name= Name;
		System.out.println("parameterized constructor");
	}
	
	public static void main(String[] args) {
		
		Class_Obj_Constructor c1 = new Class_Obj_Constructor();
		Class_Obj_Constructor c2 = new Class_Obj_Constructor(1, "Kiki");
		c1.displayValue();
		c2.displayValue();
		//c2.Name;
		System.out.println(c2.id);
		
	}
	
	void displayValue() {
		System.out.println(id+". "+Name);
	}
	
	
}
