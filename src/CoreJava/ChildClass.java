package CoreJava;

public class ChildClass extends ParentClass{

	public ChildClass() {
		super();// super keyword should be constructor  to call the super class constructor
		System.out.println("child class constructor");
	}
	
	public static void main(String[] args) {
		
	
	// if object of subclass is not created then constructor of base class wont be called
		ChildClass cc = new ChildClass();	
	//if base class and sub class have same method names then super keyword is used to call the method of the 
	//	super class 
	//	sum(); //but can call methods of the base class
		
		cc.sum();//child class
	}
	
	public void sum() {
		super.sum();  //should be called in a method to call a method
		int i = 20;
		int j = 20;
		System.out.println("Sum is " +(i+j));
	}
}
