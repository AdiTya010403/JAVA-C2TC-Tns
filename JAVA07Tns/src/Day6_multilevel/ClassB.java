package Day6_multilevel;

public class ClassB extends ClassA 
{
	private String name;
	public ClassB()
	{
		this(100,"PVG Student");
		System.out.println("B is default ");
	}
	
	public ClassB(int number , String name)
	{
		super(number)
		this.name =  name;
	}
	
	public void show()
	{
		System.out.println(this.name);
	}

}
