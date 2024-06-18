package Day17;

public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		GreetInterface greet= (s)-> "Hello" +s;
		
		System.out.println(greet.sayHelloString("Students!"));
		
		greet = (s)-> "hi "+s+" How Are You?";
		System.out.println(greet.sayHelloString("Students!"));	
		
		System.out.println("\n\nUsing Implements");
		
		greet = new Greet1();
		System.out.println("\n"+greet.sayHelloString("Aditya !"));

		greet = new Greet2();
		System.out.println("\n"+greet.sayHelloString("Shreya !"));
	}

}

class Greet1 implements GreetInterface{

	@Override
	public String sayHelloString(String name) {
		
		return "Hello "+name;
	}
	
}

class Greet2 implements GreetInterface{

	@Override
	public String sayHelloString(String name) {
		
		return "Hi "+name+" How are you?";
	}
	
}
