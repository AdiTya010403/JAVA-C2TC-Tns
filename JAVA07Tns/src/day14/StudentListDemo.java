package day14;

import java.util.ArrayList;
import java.util.Collections;

public class StudentListDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		Student s = new Student();
		
		studentList.add(new Student(20,"Aditya",88));
		studentList.add(new Student(22,"Ram",90));
		studentList.add(new Student(27,"Dham",92));
		studentList.add(new Student(04,"Tushti",85));
		studentList.add(new Student(32,"Sham",89));
		
		System.out.println("--------Student List before Sorting-------");
		System.out.println(studentList);
		Collections.sort(studentList);
		System.out.println("--------Student List after Sorting-------");
		System.out.println(studentList);

	}

}
