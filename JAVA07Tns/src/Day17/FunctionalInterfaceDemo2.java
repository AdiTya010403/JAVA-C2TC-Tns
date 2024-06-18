package Day17;

public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		GreetInterface greet= (s)-> "Hello" +s;
		
		System.out.println(greet.sayHelloString("Students!"));
		
		greet = (s)-> "hi "+s+" How Are You?";
		System.out.println(greet.sayHelloString("Students!"));		
	};
	


}
