package Day6_multilevel;

public class ClassA 
{
	private int number ;
	public void classA()
	{
		
		System.out.println("default constructor");
		this(5);
	}
	public void classA(int number)
	{
		System.out.println("parameterized constructor");
		this.number = number;
	}
	public void show()
	{
		System.out.println(this.number);
	}
}
