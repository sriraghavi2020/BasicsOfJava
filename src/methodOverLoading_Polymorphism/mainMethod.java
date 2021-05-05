package methodOverLoading_Polymorphism;

public class mainMethod {

	
	public static void main(String[] args) {
		
		
		//while creating obj of that class(sameClass/subClass) we can access all method of the subClass and parentClass
		
		//basic concept of creating a obj ref to subClass and accessing methods from subClass and superClass
		
		BMW bmw = new BMW();
		
		bmw.start();
		bmw.model();
		bmw.color();
		bmw.luxFeature();
		bmw.insurance();
		bmw.engine();// grandClass
		bmw.stop();
		
		
		//while creating obj of the subClass with superClass variable we can access only the methods which are overridden
		//we can't access the methods in the subClass which are not overridden
		
		//topCasting//Dynamic/RunTime polymorphism
		car car = new BMW();
		car.start();
		car.model();
		car.color();
		car.engine();//GranClass
		car.stop();
		
		
		
	}
}
