package Day16;

public class StringFunctionsDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s= "Hello! How are you?";
		System.out.println("Length of String is:                 " +s.length());
		System.out.println("Is String Start with Hello ?         " +s.startsWith("Hello"));
		System.out.println("Is String ends with ?                " +s.endsWith("?"));
		System.out.println("Return element at 7th index:         " +s.charAt(7));
		System.out.println(" Return element at 10th index :      " +s.charAt(10));
		System.out.println("Return index of e                    " +s.indexOf("e"));
		System.out.println("Return last index of e 			     " +s.lastIndexOf("e"));
		System.out.println("Return index of z :					 " +s.indexOf("z"));
		System.out.println("Make all String in capital letters:  " +s.toUpperCase());
		System.out.println("Make all String in small letters:    " +s.toLowerCase());
		System.out.println("Substring 7 to Last :				 " +s.substring(7));
		System.out.println("Substring 7 to 10 :			         " +s.substring(7 , 10));
		System.out.println("Check if Hii is present? 			 " +s.contains("hi"));
		System.out.println("Replace Hello with Hii 				 " +s.replace("Hello", "Hii"));
		System.out.println("Initial String is :					 " +s);

	}

}
