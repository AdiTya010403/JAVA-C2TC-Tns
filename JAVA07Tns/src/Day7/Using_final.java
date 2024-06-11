package Day7;

public class Using_final {
 int x;
 final int y = 10; //constatnt with value 10
 final int z ;
 
 public Using_final()
 {
	 x++;
	 
	 z = 20 ;
 }
 
 	public Using_final(int value )
 	{
 		x = value;
 		z= value;
 	}

	@Override
	public String toString() {
		return "Using_final [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
