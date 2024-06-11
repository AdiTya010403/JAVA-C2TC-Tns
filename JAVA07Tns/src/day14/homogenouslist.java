package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class homogenouslist {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nameList =  new ArrayList<String>();
		nameList.add("Aditya");
		nameList.add("pan");
		nameList.add("Arpan");
		
		System.out.println("List is " +nameList);
		Collections.sort(nameList);
		
		System.out.println("Sorting NameList:" +nameList);
		
		ArrayList<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("Aditya","Nashik" ,89898988989l));
		personList.add(new Person("Arpan","Pune" ,89898944989l));
		personList.add(new Person("jade","nashik" ,89988989l));
		
		System.out.println("Person List :" +personList);
		
		
		Iterator<Person> it = personList.iterator();
		
		while(it.hasNext())
		{
			Person p = (Person) it.next();
			System.out.println("Person is :" +p);
			it.remove();	
	}
		
		System.out.println(personList.size());
		Collections.sort(nameList);
		
Comparator<Person> comp=(p1, p2) -> p1.getName().compareTo(p2.getName());
		
		Collections.sort(personList, comp);
		System.out.println("-----Sorting names in Person in Ascending order-----");
		System.out.println(personList);
		
		comp=(p1,p2)-> (int) (p1.getContactno()-p2.getContactno());
		Collections.sort(personList, comp);
		System.out.println("-----Sorting contactNo in Person in Ascending order-----");
		System.out.println(personList);
	}
	

}
