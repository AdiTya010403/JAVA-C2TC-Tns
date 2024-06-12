package day14;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList<String> cityList =  new LinkedList<String>();
		
		cityList.add("Nashik");
		cityList.add("Pune");
		cityList.add("Mumbai");
		
		System.out.println(cityList);
		System.out.println("--------------------------------------------");
		cityList.add(2,"Delhi");
		System.out.println(cityList);
		System.out.println("---------------------------------------------");
		cityList.addFirst("Hyderabad");
		cityList.addFirst("Chennai");
		System.out.println(cityList);
		System.out.println("---------------------------------------------");
		
		System.out.println("First City" +cityList.getFirst());
		System.out.println("Last City" +cityList.getLast());
		System.out.println("City at Position 2 :" +cityList.get(2));
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Removed citya at 2 position :" +cityList.remove(2));
		System.out.println("Removed city at positin 2 : " +cityList.remove(2));
		//IndexOutOfBoundException : Index : 10 , Size : 5
		
		
		System.out.println(cityList);
		System.out.println("Mumbai city removed " +cityList.remove ("Mumbai"));
		System.out.println("Banglore city removed " +cityList.remove ("Banglore"));
		System.out.println("Removes First city  " +cityList.removeFirst ());
		System.out.println("Removes Last city  " +cityList.removeLast ());
		
		System.out.println("-------------------------------------------");
		System.out.println("List Cleared cityList.clear() :");
		cityList.clear(); //remove all values
		
		System.out.println(cityList);
		System.out.println("Size : " +cityList.size());
		
		cityList.add("Mumbai");
		cityList.add("Delhi");
		cityList.add("Nasik");
		cityList.add("Nagpur");
		cityList.add("Dubai");
		cityList.add("Pune");
		cityList.add("Banglore");
		cityList.add("Hyedrabad");
		cityList.add("Chennai");
		
		System.out.println("=----------------------------------------------------=");
		System.out.println(cityList);
		System.out.println("Size :" +cityList.size());
		
		ListIterator<String> lit = cityList.listIterator();
		while(lit.hasNext())
			System.out.println(lit.next().toUpperCase());
		System.out.println("=----------------------------------------------------=");
		
		
		lit = cityList.listIterator();
		while (lit.hasNext())
		{
			String city = lit.next();
			if(city.equals("Delhi"))
				lit.remove();
			if(city.equals("Nasik"))
				lit.set("Nashik");
			if(city.equals("Nagpur"))
				lit.add("Jaipur");
		}
		
			System.out.println(cityList);
			System.out.println("-------------------------------------------------");
			lit = cityList.listIterator(cityList.size());
			while(lit.hasPrevious())
			{
				System.out.println(lit.previous());
				
			}
			
			System.out.println("-------------------------------------------------");

		

	}

}
