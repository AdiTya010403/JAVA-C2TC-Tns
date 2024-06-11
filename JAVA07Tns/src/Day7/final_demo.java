package Day7;

public class final_demo {

	public static void main (String[] args)
	{
	Using_final obj = new Using_final();
	System.out.println(obj);
	
	Using_final objnew = new Using_final(5);
	System.out.println(objnew);
	
	Using_final objone= new Using_final(50);
	System.out.println(objone);
	
	
	final class ClassA
	{
		public ClassA()
		{
			System.out.println("This is final class");
		}
	}
	
	ClassX
	{
		public void show()
		{
			System.out.println("Show in class x");
		}
		
		public void display()
		{
			System.out.println("display() in class x");
		}
	}
	
	ClassY extends ClassX
	{
		
	}
		
	}
}
