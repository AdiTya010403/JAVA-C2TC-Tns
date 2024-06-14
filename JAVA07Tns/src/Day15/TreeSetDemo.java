package Day15;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		TreeSet<String> courseSet = new TreeSet<String>();
		
		courseSet.add("Aditya");
		courseSet.add("Domnic");
		courseSet.add("Chetan");
		courseSet.add("Babu");
		courseSet.add("Eliana");
		
		System.out.println(courseSet);
		System.out.println("First Name : " +courseSet.first());
		System.out.println("Last Name : " +courseSet.last());
		
		courseSet.remove("Babu");  //
		System.out.println(courseSet);
		
		courseSet.pollFirst();  //remove forst element
		System.out.println(courseSet);	
		
		courseSet.pollLast();  //remove forst element
		System.out.println(courseSet);
		
		//courseSet.add(null); //throws nullPointer Exception
		System.out.println("--------------------------------------------------------------------------");
		
		Comparator<Employee> comp =  (e1,e2) -> e1.getEmpId()-e2.getEmpId();
		//Comparator<Employee> comp =  (e1,e2) -> (int) (e1.getSalary()-e2.getSalary());
		
		TreeSet<Employee> empSet = new TreeSet<Employee>(comp);
		empSet.add(new Employee(101,"Pandhrinath",800000));
		empSet.add(new Employee(102,"Pandurang",900000));
		empSet.add(new Employee(103,"bakerao",1000000));
		empSet.add(new Employee(104,"Tatyarao",1000000));
		empSet.add(new Employee(105,"latakakuu",1000000));
		
		System.out.println("Employee Details: \n" +empSet);
		
	}

}
