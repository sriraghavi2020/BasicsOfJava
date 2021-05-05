package methodOverLoading_Polymorphism;

public class car extends Vehicle{
	
	public void model() {
		System.out.println("Honda");
		System.out.println("Toyota");
		System.out.println("BMW");
	}
	public void color() {
	System.out.println("Color :");	
	System.out.println("metalic");
	System.out.println("Pearl");
	}
	
	public void start() {
		System.out.println("car ---> start");
	}
	
	public void stop() {
		System.out.println("car ---> stop");
	}
}
