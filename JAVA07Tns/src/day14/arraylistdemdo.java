package day14;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistdemdo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
 
		System.out.println(a.add(10));
		a.add(20);
		a.add(30);
		System.out.println("Arraylist is : "+a);
		System.out.println("Size of array is: "+a.size());
		a.add(45);
		a.add(50);
		a.add("Hello");
		a.add(5.0);
		System.out.println("Arraylis is : "+a);
		System.out.println("Is 30 present: "+a.contains(30));
		System.out.println("Is 300 present: "+a.contains(300));
		System.out.println("Index of 20 is: "+a.indexOf(20));

		Iterator i=a.iterator();
		System.out.println("---------------------------------------");
		while(i.hasNext())
			
			System.out.println(i.next());
		

	}

}
