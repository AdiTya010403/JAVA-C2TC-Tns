package Day15;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs1 =  new HashSet<Integer>();
		
		System.out.println(hs1.add(60));
		hs1.add(70);
		hs1.add(50);
		hs1.add(40);
		System.out.println(hs1.add(60));
		hs1.add(30);
		hs1.add(20);
		hs1.add(10);
		
		System.out.println("First Set " +hs1);
		System.out.println("-----------------------");
		
		HashSet<Integer> hs2 =  new HashSet<Integer>();
		hs2.add(70);
		hs2.add(50);
		hs2.add(40);
		System.out.println(hs2.add(60));
		hs2.add(30);
		hs2.add(20);
		hs2.add(10);
		
		System.out.println("Second Set: "+hs2);
		System.out.println("----------------------------------");
		
		System.out.println("Union");
		hs1.addAll(hs2); //Union
		
		System.out.println("First Set: "+hs1);
		System.out.println("Second Set: "+hs2);
		System.out.println("----------------------------------");
		
		hs1.clear();
		hs1.add(60);
		hs1.add(90);
		hs1.add(20);
		hs1.add(70);
		hs1.add(50);
		hs1.add(80);
		
		System.out.println("First Set: "+hs1);
		System.out.println("Second Set: "+hs2);
		System.out.println("----------------------------------");
		
		System.out.println("Intersection");
		hs1.retainAll(hs2); // Intersection
		
		System.out.println("First Set: "+hs1);
		System.out.println("Second Set: "+hs2);
		System.out.println("----------------------------------");
		
		hs1.clear();
		hs1.add(60);
		hs1.add(90);
		hs1.add(20);
		hs1.add(70);
		hs1.add(50);
		hs1.add(80);
		System.out.println("First Set: "+hs1);
		System.out.println("Second Set: "+hs2);
		System.out.println("----------------------------------");
		
		System.out.println("Set Difference");
		hs1.remove(hs2); //Set Difference
		
		System.out.println("First Set: "+hs1);
		System.out.println("Second Set: "+hs2);
		System.out.println("----------------------------------");
		
	}
}
