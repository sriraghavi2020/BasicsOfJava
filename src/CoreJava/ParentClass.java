package CoreJava;

public class ParentClass {
	
	public ParentClass()
	{
		System.out.println("parent class constructor");
	}
	
	public ParentClass(int i)
	{
		System.out.println("parent class constructor with "+i+" args");
	}

	public void sum() {
		int i =10;
		int j = 20;
		System.out.println("Sum is " +(i+j));
	}
}
