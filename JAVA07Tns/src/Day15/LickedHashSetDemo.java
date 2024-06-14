package Day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LickedHashSetDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(60);
		lhs.add(50);
		lhs.add(70);
		lhs.add(80);
		
		System.out.println(lhs);
		
		Iterator<Integer> it = lhs.iterator();
		
		while(it.hasNext())
		
			System.out.println(it.next() +"\t");
			
			System.out.println("Size :" +lhs.size()) ;
			lhs.remove(30);
			lhs.remove(90);
			System.out.println(lhs);
			
			
			System.out.println("--------------------------------------------------------------------------");
			ArrayList<Integer> a = new ArrayList<Integer>(lhs);
			System.out.println(a);
			Collections.sort(a);
			System.out.println("After Sorting : " +a);
			
			lhs =  new LinkedHashSet<Integer>(a);
			System.out.println(lhs);
			
			
			
		
		
		
	}

}
