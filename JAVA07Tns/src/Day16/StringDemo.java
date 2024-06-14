package Day16;

import java.io.BufferedOutputStream;

public class StringDemo 
{
	public static void main(String[] args) {
		
		String s1 ="Hello";
		String s2 = "Hello";
		
		String s3 =  new String("Hello"); //allocates on heap
		
		System.out.println("s1==s2 ?" +(s1==s2));
		System.out.println("s1==s3 ?"  +(s1==s3));
		System.out.println("s1.equals(s2) ?" +s1.equals(s2));
		System.out.println("s1.equals(s3) ?" +s1.equals(s3));
		
		String s4 = s1; //points to the same area on stream pool
		System.out.println("Is s1==s4" +s1==s4);
		System.out.println("s1.equals(s4) ?" +s1.equals(s4));
		

		String s5 = new String("Hello"); // aloocate another memory on heap
		System.out.println("Is s3==s5" +s5==s3);
		System.out.println("s3.equals(s5) ?" +s3.equals(s5));
		
		String s6 = s3;
		System.out.println("Is s6==s3 "+(s6==s3));
		System.out.println("s6.equals(s3) ?" +s6.equals(s3));
		
		String s7 = s3.intern(); //points on a the same area on string pool 
		System.out.println("Is s7==s3 "+(s7==s3));
		System.out.println("s7.equals(s3) ?" +s7.equals(s3));
		System.out.println("Is s7==s1 ?" +(s7==s3));
		
		String s8 = new String ("Hii");
		String s9 = s8.intern();
		System.out.println("Is s8==s9 ?" +(s8==s9));
		
	}
}
